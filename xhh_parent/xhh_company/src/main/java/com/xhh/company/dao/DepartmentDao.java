package com.xhh.company.dao;

import com.xhh.domain.company.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @description
 * @author: weiXhh
 * @create: 2020-04-17 14:47
 **/
public interface DepartmentDao extends JpaRepository<Department,String>, JpaSpecificationExecutor<Department> {
}
