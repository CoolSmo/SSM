package com.wudskq.serviceimpl;

import com.wudskq.dao.DemoDao;
import com.wudskq.entity.Demo;
import com.wudskq.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PackageName com.wudskq.serviceimpl
 * @ClassName TestServiceImpl
 * @Author wudskq
 * @Email socrates11@foxmail.com
 * @Date 2021/4/10 IntelliJ IDEA
 * @Since 1.0
 * @Description 测试业务类的实现
 **/
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;

    //根据姓名查询出这个人的所有信息
    public Demo queryByName(String name){
       Demo demo = demoDao.queryByName(name);
       return demo;
    }
}
