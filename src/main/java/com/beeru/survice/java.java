package com.beeru.survice;

public class java implements Icourse
{
@Override
public boolean getTheCourse(double price) {
	System.err.println("the java course is purchased and fees is paid : "+price);
	return true;
}
}
