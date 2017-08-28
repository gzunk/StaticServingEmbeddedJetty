package com.gzunk;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private ApplicationContext applicationContext;

    @RequestMapping("/greeting")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/close")
    @ResponseStatus(value = HttpStatus.OK)
    public void close() {
        SpringApplication.exit(applicationContext);
    }


}
