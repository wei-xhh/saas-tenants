package com.xhh.company.service.impl;

import com.xhh.common.utils.IdWorker;
import com.xhh.company.dao.CompanyDao;
import com.xhh.company.service.CompanyService;
import com.xhh.domain.company.Company;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description
 * @author: weiXhh
 * @create: 2020-04-15 17:23
 **/
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private IdWorker idWorker;

    @Override
    public void add(Company company) {
        String id = idWorker.nextId() + "";
        company.setId(id);
        company.setAuditState("0"); // 是否审核
        company.setState(1); // 是否激活
        companyDao.save(company);
    }

    @Override
    public void update(Company company) {
        Company temp = companyDao.findById(company.getId()).get();
        BeanUtils.copyProperties(company, temp);
        companyDao.save(temp);
    }

    @Override
    public void deleteById(String id) {
        companyDao.deleteById(id);
    }

    @Override
    public Company findById(String id) {
        Company company = companyDao.findById(id).get();
        return company;
    }

    @Override
    public List<Company> findAll() {
        List<Company> all = companyDao.findAll();
        return all;
    }
}
