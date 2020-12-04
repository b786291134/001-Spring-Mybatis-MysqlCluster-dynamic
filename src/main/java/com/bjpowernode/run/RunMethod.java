package com.bjpowernode.run;

import com.bjpowernode.bean.User;
import com.bjpowernode.service.SqlService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RunMethod {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlService sqlService= (SqlService) applicationContext.getBean("sqlServiceImpl");
        System.out.println(sqlService);
        System.out.println("----------------------新增前--------------------------");
        System.out.println(sqlService.selectAll());
        User user=new User();
        user.setName("牛哈哈1");
        System.out.println("新增结果:"+sqlService.add(user));
        System.out.println("----------------------新增后--------------------------");
        System.out.println(sqlService.selectAll());
    }
}
