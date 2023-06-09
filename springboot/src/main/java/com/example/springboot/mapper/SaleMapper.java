package com.example.springboot.mapper;

import com.example.springboot.controller.request.BaseRequest;
import com.example.springboot.entity.Sale;
import com.example.springboot.mapper.po.BorrowReturCountPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @BelongsProject: library-management
 * @BelongsPackage: com.example.springboot.mapper
 * @Author: DownsXu
 * @Date: 2023-06-07 15:56
 * @Description: TODO
 */

@Mapper
public interface SaleMapper {
    List<Sale> list();

    List<Sale> listByCondition(BaseRequest baseRequest);

    void save(Sale obj);

    Sale getById(Integer id);

    void updateById(Sale user);

    void deleteById(Integer id);

    List<BorrowReturCountPO> getCountByTimeRange(@Param("timeRange") String timeRange, @Param("type") int type);
}
