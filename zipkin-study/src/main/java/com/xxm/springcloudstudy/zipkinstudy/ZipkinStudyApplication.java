package com.xxm.springcloudstudy.zipkinstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinStudyApplication.class, args);
    }

}
