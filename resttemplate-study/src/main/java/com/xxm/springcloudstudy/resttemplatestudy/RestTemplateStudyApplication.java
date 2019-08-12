package com.xxm.springcloudstudy.resttemplatestudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Xiaoming Xu
 * @date 2019/8/11
 */
@SpringBootApplication
public class RestTemplateStudyApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTemplateStudyApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
