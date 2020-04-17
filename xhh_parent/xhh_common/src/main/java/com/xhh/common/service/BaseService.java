package com.xhh.common.service;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * @description
 * @author: weiXhh
 * @create: 2020-04-17 16:08
 **/
public class BaseService<T> {

    public Specification<T> getSpec(String companyId){
        Specification<T> spec = new Specification<T>() {
            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
                return cb.equal(root.get("companyId").as(String.class), companyId);
            }
        };
        return spec;
    }

}
