package com.wudskq.service;

import com.wudskq.dao.DemoDao;
import com.wudskq.entity.Demo;
import org.springframework.stereotype.Service;

/**
 * @PackageName com.wudskq.service
 * @ClassName TestService
 * @Author wudskq
 * @Email socrates11@foxmail.com
 * @Date 2021/4/10 IntelliJ IDEA
 * @Since 1.0
 * @Description 测试业务类
 **/
@Service
public interface DemoService {
    //根据姓名查询出这个人的所有信息
    public Demo queryByName(String name);
}
