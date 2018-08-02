package com.yugioh.redis2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test/")
public class TestController {

    @RequestMapping("/setValue")
    public String setValue(HttpServletRequest request) {
        System.out.println("本次访问的sessionId为" + request.getSession().getId());
        request.getSession().setAttribute("test", "test");
        return "访问成功";
    }


    @RequestMapping("/getValue")
    public String getValue(HttpServletRequest request) {
        System.out.println("本次访问的sessionId为" + request.getSession().getId());
        System.out.println(request.getSession().getAttribute("test"));
        return "访问成功";
    }

}