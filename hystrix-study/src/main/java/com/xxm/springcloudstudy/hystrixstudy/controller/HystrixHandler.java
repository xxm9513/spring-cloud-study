package com.xxm.springcloudstudy.hystrixstudy.controller;

import com.xxm.springcloudstudy.entity.Student;
import com.xxm.springcloudstudy.hystrixstudy.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @Value("${foo}")
    private String foo;

    @Value("${spring.profiles.active}")
    private String profiles;

    @Value("${test}")
    private String test;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }

    @GetMapping("getFoo")
    public String getFoo() {
        return foo + " : " + profiles + " : " + test;
    }
}