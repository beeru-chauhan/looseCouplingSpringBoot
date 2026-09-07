package com.beeru.survice;

public class Maven  implements Icourse
{
@Override
public boolean getTheCourse(double price) {
	System.err.println("the maven course is purchased and fees is paid : "+price);
	return true;
}
}
