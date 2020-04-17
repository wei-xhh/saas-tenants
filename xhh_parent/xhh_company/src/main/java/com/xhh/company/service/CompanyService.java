package com.xhh.company.service;

import com.xhh.domain.company.Company;

import java.util.List;

/**
 * @description
 * @author: weiXhh
 * @create: 2020-04-15 17:20
 **/
public interface CompanyService {
    /**
     * 添加企业
     */
    public void add(Company company);
    /**
     * 更新企业
     */
    public void update(Company company);
    /**
     * 删除企业
     */
    public void deleteById(String id);
    /**
     * 根据id查询企业
     */
    public Company findById(String id);
    /**
     * 查询所有企业
     */
    public List<Company> findAll();
}
