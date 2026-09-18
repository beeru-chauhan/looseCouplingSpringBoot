package com.beeru.survice;

import org.springframework.stereotype.Service;

@Service
public class Survice implements Icourse {

    @Override
    public boolean getTheCourse(double price) {
        System.out.println("the java course is purchased and fees " + price);
        return true;
    }
}