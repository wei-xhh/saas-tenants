package com.xhh.company.service;

import com.xhh.common.service.BaseService;
import com.xhh.domain.company.Company;
import com.xhh.domain.company.Department;

import java.util.List;

/**
 * @description
 * @author: weiXhh
 * @create: 2020-04-15 17:20
 **/
public interface DepartmentService{
    /**
     * 保存部门
     */
    public void add(Department department);
    /**
     * 更新部门
     */
    public void update(Department department);
    /**
     * 删除部门
     */
    public void deleteById(String id);
    /**
     * 根据id查询部门
     */
    public Department findById(String id);
    /**
     * 查询某个公司下所有部门
     */
    public List<Department> findAll(String companyId);
}
