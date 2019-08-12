package com.xxm.springcloudstudy.resttemplatestudy.controller;

import com.xxm.springcloudstudy.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.Objects;

@RestController
@RequestMapping("/reslt")
public class RestHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        Collection body = restTemplate.getForEntity("http://localhost:8010/student/findAll", Collection.class).getBody();
        Objects.requireNonNull(body);
        // body的真实类型
        System.out.println(body.getClass().getName());
        for (Object o : body) {
            // o的真实类型
            System.out.println(o.getClass().getName());
            break;
        }
        System.out.println(body);
        return body;
    }

    @GetMapping("/findAll2")
    public Collection<Student> findAll2() {
        return restTemplate.getForObject("http://localhost:8010/student/findAll", Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}", Student.class, id).getBody();
    }

    @GetMapping("/findById2/{id}")
    public Student findById2(@PathVariable("id") long id) {
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}", Student.class, id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForEntity("http://localhost:8010/student/save", student, null).getBody();
    }

    @PostMapping("/save2")
    public void save2(@RequestBody Student student) {
        restTemplate.postForObject("http://localhost:8010/student/save", student, null);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        restTemplate.put("http://localhost:8010/student/update", student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id) {
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}", id);
    }
}