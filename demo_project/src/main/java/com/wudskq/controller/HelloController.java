package com.wudskq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName com.wudskq.controller
 * @ClassName HelloController
 * @Author wudskq
 * @Email socrates11@foxmail.com
 * @Date 2021/3/29 IntelliJ IDEA
 * @Since 1.0
 * @Description
 **/
@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return name;
    }

}
