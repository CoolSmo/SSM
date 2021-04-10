package com.wudskq.dao;

import com.wudskq.entity.Demo;
import org.springframework.stereotype.Repository;

/**
 * @PackageName com.wudskq.dao
 * @ClassName TestDao
 * @Author wudskq
 * @Email socrates11@foxmail.com
 * @Date 2021/4/10 IntelliJ IDEA
 * @Since 1.0
 * @Description 测试mapper映射层
 **/
@Repository
public  interface DemoDao {

    //根据姓名查询出这个人的所有信息
    public Demo queryByName(String name);
}
