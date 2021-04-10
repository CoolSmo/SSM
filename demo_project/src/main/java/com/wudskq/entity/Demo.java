package com.wudskq.entity;

import org.springframework.stereotype.Component;

/**
 * @PackageName com.wudskq.entity
 * @ClassName Test
 * @Author wudskq
 * @Email socrates11@foxmail.com
 * @Date 2021/4/10 IntelliJ IDEA
 * @Since 1.0
 * @Description  测试实体类
 **/
@Component
public class Demo {
    //主键id自增
    private Integer id;
    //测试字段
    private String tName;
    //测试字段
    private String tAge;
    //测试字段
    private String tSex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettAge() {
        return tAge;
    }

    public void settAge(String tAge) {
        this.tAge = tAge;
    }

    public String gettSex() {
        return tSex;
    }

    public void settSex(String tSex) {
        this.tSex = tSex;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", tName='" + tName + '\'' +
                ", tAge='" + tAge + '\'' +
                ", tSex='" + tSex + '\'' +
                '}';
    }
}
