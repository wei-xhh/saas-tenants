package com.xhh.domain.company.response;

import com.xhh.domain.company.Company;
import com.xhh.domain.company.Department;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @description
 * @author: weiXhh
 * @create: 2020-04-17 15:29
 **/
@Getter
@Setter
@NoArgsConstructor
public class DeptListResult {
    private String companyId;
    private String companyName;
    private String companyManage;
    private List<Department> depts;

    public DeptListResult(Company company, List<Department> depts){
        this.companyId = company.getId();
        this.companyName = company.getName();
        this.companyManage = company.getLegalRepresentative(); //公司联系人
        this.depts = depts;
    }
}
