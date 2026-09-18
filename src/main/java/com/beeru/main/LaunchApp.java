package com.beeru.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.beeru.survice.Geek;

public class LaunchApp {
    public static void main(String[] args) {
        
        // 1. XML File ka naam paas kiya
    	ApplicationContext container = new ClassPathXmlApplicationContext("/config.xml");

        // 2. Spring container se Geek ka object mangwaya
        Geek g = container.getBean(Geek.class);
        
        // 3. Method call karke check karo
        // g.buyTheCourse(5000.0); 
    }
}