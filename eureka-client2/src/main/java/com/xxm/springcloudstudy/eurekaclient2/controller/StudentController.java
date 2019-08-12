package com.xxm.springcloudstudy.eurekaclient2.controller;

import com.netflix.discovery.converters.Auto;
import com.xxm.springcloudstudy.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Xiaoming Xu
 * @date 2019/8/11
 */
@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("getById/{id}")
    public Student getById(@PathVariable("id") Long id) {
        return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}", Student.class, id).getBody();
    }
}
