package com.hanzikids.demo;


import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.hanzikids.demo" })
public class AppConfiguration extends WebMvcConfigurerAdapter {

}
