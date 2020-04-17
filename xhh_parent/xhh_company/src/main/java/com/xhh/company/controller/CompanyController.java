package com.xhh.company.controller;

import com.xhh.common.entity.Result;
import com.xhh.common.entity.ResultCode;
import com.xhh.company.service.CompanyService;
import com.xhh.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description
 * @author: weiXhh
 * @create: 2020-04-15 17:58
 **/
@CrossOrigin(origins = {"http://localhost:8080", "null"})
@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    // 添加企业
    @PostMapping
    public Result save(@RequestBody Company company){
        companyService.add(company);
        return Result.SUCCESS();
    }
    // 更新企业
    @PutMapping("/{id}")
    public Result update(@PathVariable("id") String id, @RequestBody Company company){
        company.setId(id);
        companyService.update(company);
        return Result.SUCCESS();
    }
    // 删除企业
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
        companyService.deleteById(id);
        return Result.SUCCESS();
    }
    // 根据用户id查询企业
    @GetMapping("/{id}")
    public Result findById(@PathVariable("id") String id){
        Company company = companyService.findById(id);
        return Result.SUCCESS_DATA(company);
    }
    // 查询全部企业
    @GetMapping
    public Result findAll(){
        List<Company> all = companyService.findAll();
        return Result.SUCCESS_DATA(all);
    }
}
