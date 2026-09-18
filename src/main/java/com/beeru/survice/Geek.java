package com.beeru.survice;

import java.security.PublicKey;

public class Geek {
	private Icourse course;
	
public void setCourse(Icourse course) {
		this.course = course;
	}
public Geek( Icourse course)
{
	System.out.println("setting value of course using parameterised comstructor");
	this.course=course;
}
public Geek()
{
	System.out.println("setting value of course using zero parameterised constructor");
}

 public boolean buyThecourse(double price)
{
	return course.getTheCourse(price);
}
}
