package com.hanzoy.system.controller;

import com.hanzoy.system.domain.Test;
import com.hanzoy.system.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class testController {

    @Resource
    private TestService testService;

    @GetMapping("/test")
    public List<Test> test(){
        log.info("test");
        return testService.list();
    }

    @GetMapping("/show")
    public String show(){
        return "lslsls";
    }
}
