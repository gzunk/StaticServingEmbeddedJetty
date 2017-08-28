package com.gzunk;

import java.util.Arrays;

import org.eclipse.jetty.servlet.DefaultServlet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.servlet.Servlet;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public ServletRegistrationBean servletRegistrationBean(){
//
//        ServletRegistrationBean srb = new ServletRegistrationBean(new DefaultServlet(), "/hello/*");
//        String homePath = System.getProperty("user.home");
//        srb.addInitParameter("resourceBase", homePath);
//        srb.addInitParameter("dirAllowed","true");
//        srb.addInitParameter("pathInfoOnly","true");
//
//        return srb;
//    }

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }

}
