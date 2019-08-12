package com.xxm.springcloudstudy.feignstudy.controller;

import com.xxm.springcloudstudy.entity.Student;
import com.xxm.springcloudstudy.feignstudy.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author Xiaoming Xu
 * @date 2019/8/12
 */
@RestController
@RequestMapping("feign")
public class FeignHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @Value("${foo}")
    private String foo;

    @Value("${boot}")
    private String boot;

    @GetMapping("findAll")
    public Collection<Student> findAll() {
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }

    @GetMapping("/getFoo")
    public String getFoo(){
        return foo + " : " + boot;
    }
}
