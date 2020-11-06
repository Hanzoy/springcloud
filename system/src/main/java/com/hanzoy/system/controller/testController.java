package com.hanzoy.system.controller;

import com.hanzoy.system.domain.Test;
import com.hanzoy.system.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class testController {

    @Resource
    private TestService testService;

    @GetMapping("/test")
    public List<Test> test(){
        return testService.list();
    }
}
