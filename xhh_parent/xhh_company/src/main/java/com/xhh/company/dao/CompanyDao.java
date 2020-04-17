package com.xhh.company.dao;


import com.xhh.domain.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @description
 * @author: weiXhh
 * @create: 2020-04-15 16:16
 **/
public interface CompanyDao extends JpaRepository<Company,String>, JpaSpecificationExecutor<Company> {
}
