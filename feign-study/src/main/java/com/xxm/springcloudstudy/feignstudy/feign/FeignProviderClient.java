package com.xxm.springcloudstudy.feignstudy.feign;

import com.xxm.springcloudstudy.entity.Student;
import com.xxm.springcloudstudy.feignstudy.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author Xiaoming Xu
 * @date 2019/8/12
 */
@FeignClient(value = "provider", fallback = FeignError.class)
public interface FeignProviderClient {
    @GetMapping("student/findAll")
    Collection<Student> findAll();

    @GetMapping("student/getPort")
    String index();
}
