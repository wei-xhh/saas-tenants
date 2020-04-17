package com.xhh.company.controller;

import com.xhh.common.controlller.BaseController;
import com.xhh.common.entity.Result;
import com.xhh.company.service.CompanyService;
import com.xhh.company.service.DepartmentService;
import com.xhh.domain.company.Company;
import com.xhh.domain.company.Department;
import com.xhh.domain.company.response.DeptListResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description
 * @author: weiXhh
 * @create: 2020-04-17 15:00
 **/
@RestController
@CrossOrigin
@RequestMapping("/company")
public class DepartmentController extends BaseController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private CompanyService companyService;

    // 保存部门
    @PostMapping
    public Result save(@RequestBody Department department){
        // 保存公司的id
//        String companyId = "1";
        department.setCompanyId(companyId);

        departmentService.add(department);
        return Result.SUCCESS();
    }
    // 更新部门
    @PutMapping("/department/{id}")
    public Result update(@PathVariable("id") String id, @RequestBody Department department){
        department.setId(id);
        departmentService.update(department);
        return Result.SUCCESS();
    }
    // 删除部门
    @DeleteMapping("/department/{id}")
    public Result delete(@PathVariable("id") String id){
        departmentService.deleteById(id);
        return Result.SUCCESS();
    }
    // 根据部门id查询部门
    @GetMapping("/department/{id}")
    public Result findById(@PathVariable("id") String id){
        Department department = departmentService.findById(id);
        return Result.SUCCESS_DATA(department);
    }
    // 查询某个公司下所有部门
    @GetMapping("/department")
    public Result findAll(){
        // 写死的公司id,后期改进
//        String companyId = "1";
        Company company = companyService.findById(companyId);
        List<Department> all = departmentService.findAll(companyId);

        // 构造返回结果,包含公司的三个信息
        DeptListResult deptListResult = new DeptListResult(company,all);

        return Result.SUCCESS_DATA(deptListResult);
    }
}
