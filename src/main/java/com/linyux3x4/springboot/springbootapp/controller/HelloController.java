package com.linyux3x4.springboot.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: linyu902
 * @date: Created in 2019-11-16 16:10
 * @version: 1.0
 * @modified By:linyu902
 */
@RestController
public class HelloController {

    @Autowired
    DataSource dataSource;
    @RequestMapping("/hello")
    public String hello(){

        System.out.println("dataSource = " + dataSource);
        return "hehehehe";
    }
}
