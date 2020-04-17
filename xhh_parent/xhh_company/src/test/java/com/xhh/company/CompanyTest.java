package com.xhh.company;

import com.xhh.company.dao.CompanyDao;
import com.xhh.domain.company.Company;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @description
 * @author: weiXhh
 * @create: 2020-04-15 16:26
 **/
@SpringBootTest
public class CompanyTest {

    @Autowired
    private CompanyDao companyDao;

    @Test
    public void text(){
        Company company = companyDao.findById("1").get();
        System.out.println(company);
    }
}
