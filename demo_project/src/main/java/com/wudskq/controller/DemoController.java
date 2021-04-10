package com.wudskq.controller;

import com.wudskq.entity.Demo;
import com.wudskq.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName com.wudskq.controller
 * @ClassName DemoController
 * @Author wudskq
 * @Email socrates11@foxmail.com
 * @Date 2021/4/10 IntelliJ IDEA
 * @Since 1.0
 * @Description 测试的控制器
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;


    @GetMapping("/query/{name}")
    public Demo queryByName(@PathVariable("name") String name){
       Demo demo = demoService.queryByName(name);
       return demo;
    }



}
