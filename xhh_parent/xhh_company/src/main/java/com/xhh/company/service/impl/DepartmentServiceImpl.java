package com.xhh.company.service.impl;

import com.xhh.common.service.BaseService;
import com.xhh.common.utils.IdWorker;
import com.xhh.company.dao.DepartmentDao;
import com.xhh.company.service.DepartmentService;
import com.xhh.domain.company.Company;
import com.xhh.domain.company.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * @description
 * @author: weiXhh
 * @create: 2020-04-17 14:50
 **/
@Service
public class DepartmentServiceImpl extends BaseService implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    @Autowired
    private IdWorker idWorker;

    @Override
    public void add(Department department) {
        String deptId = idWorker.nextId()+"";
        department.setId(deptId);
        departmentDao.save(department);
    }

    @Override
    public void update(Department department) {
        Department temp = departmentDao.findById(department.getId()).get();
        temp.setCode(department.getCode());
        temp.setIntroduce(department.getIntroduce());
        temp.setName(department.getName());
        departmentDao.save(temp);
    }

    @Override
    public void deleteById(String id) {
        departmentDao.deleteById(id);
    }

    @Override
    public Department findById(String id) {
        Department department = departmentDao.findById(id).get();
        return department;
    }

    @Override
    public List<Department> findAll(String companyId) {
        // 根据企业id查询所有部门Specification
//        Specification<Department> spec = new Specification<Department>() {
//            @Override
//            public Predicate toPredicate(Root<Department> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
//                return cb.equal(root.get("companyId").as(String.class), companyId);
//            }
//        };
        List<Department> all = departmentDao.findAll(getSpec(companyId));
        return all;
    }
}
