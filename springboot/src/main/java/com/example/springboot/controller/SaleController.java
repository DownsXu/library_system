package com.example.springboot.controller;

import com.example.springboot.common.Result;
import com.example.springboot.controller.request.SalePageRequest;
import com.example.springboot.entity.Sale;
import com.example.springboot.service.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @BelongsProject: library-management
 * @BelongsPackage: com.example.springboot.controller
 * @Author: DownsXu
 * @Date: 2023-06-07 14:43
 * @Description: TODO
 */

@CrossOrigin
@RestController
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    ISaleService saleService;

    @PostMapping("/save")
    public Result save(@RequestBody Sale obj){
        saleService.save(obj);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Sale obj) {
        saleService.update(obj);
        return Result.success();
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        saleService.deleteById(id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Sale obj = saleService.getById(id);
        return Result.success(obj);
    }

    @GetMapping("/list")
    public Result list() {
        List<Sale> list = saleService.list();
        return Result.success(list);
    }

    @GetMapping("/page")
    public Result page(SalePageRequest pageRequest) {
        return Result.success(saleService.page(pageRequest));
    }

    @GetMapping("/lineCharts/{timeRange}")
    public Result lineCharts(@PathVariable String timeRange) {
        return Result.success(saleService.getCountByTimeRange(timeRange));
    }

}
