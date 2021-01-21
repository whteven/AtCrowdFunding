package com.even.manager.controller;

import com.even.manager.service.TestService;
import com.even.manager.service.impl.TestServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test.do")
    public String text(){
        System.out.println("TestController");
        System.out.println(      );
        System.out.println(      );
        System.out.println("======");
        System.out.println(testService.getClass().getName());
        testService.insert();
        return "success";
    }
}
