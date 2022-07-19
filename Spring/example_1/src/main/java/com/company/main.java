package com.company;

import com.company.beans.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args) {
        ApplicationContext cx = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld hw = cx.getBean("helloworld", HelloWorld.class);
        System.out.println(hw);
    }

}
