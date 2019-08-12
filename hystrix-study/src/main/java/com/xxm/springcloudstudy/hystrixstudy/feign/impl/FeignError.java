package com.xxm.springcloudstudy.hystrixstudy.feign.impl;

import com.xxm.springcloudstudy.entity.Student;
import com.xxm.springcloudstudy.hystrixstudy.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author Xiaoming Xu
 * @date 2019/8/12
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "500, 哈哈哈哈哈哈!!!!!!";
    }
}
