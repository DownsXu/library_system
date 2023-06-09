package com.example.springboot.service;
import com.example.springboot.controller.request.BaseRequest;
import com.example.springboot.controller.request.SalePageRequest;
import com.example.springboot.entity.Sale;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: library-management
 * @BelongsPackage: com.example.springboot.service
 * @Author: DownsXu
 * @Date: 2023-06-07 15:00
 * @Description: TODO
 */
public interface ISaleService {

    List<Sale> list();

    void save(Sale obj);

    void update(Sale obj);

    void deleteById(Integer id);

    Sale getById(Integer id);

    PageInfo<Sale> page(BaseRequest baseRequest);

    Map<String, Object> getCountByTimeRange(String timeRange);
}
