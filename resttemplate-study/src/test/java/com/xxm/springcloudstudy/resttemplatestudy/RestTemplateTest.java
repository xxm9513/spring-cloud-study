package com.xxm.springcloudstudy.resttemplatestudy;

import com.xxm.springcloudstudy.entity.Student;
import com.xxm.springcloudstudy.resttemplatestudy.controller.RestHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

/**
 * @author Xiaoming Xu
 * @date 2019/8/11
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestTemplateStudyApplication.class)
public class RestTemplateTest {
    @Autowired
    RestHandler restHandler;

    @Test
    public void test01() {
        Collection<Student> all = restHandler.findAll();
        System.out.println(all);
    }
}
