package com.xhh.common.controlller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description
 * @author: weiXhh
 * @create: 2020-04-17 16:04
 **/
public class BaseController {
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected String companyId;

    @ModelAttribute
    public void getReqAndRes(HttpServletRequest request,HttpServletResponse response){
        this.request = request;
        this.response = response;
        this.companyId = "1";
    }
}
