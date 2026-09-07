package com.beeru.survice;

public class LaunchMain {

	public static void main(String[] args) {
		Geek g=new Geek();
		g.setCourse(new java());
	boolean status=	 g.buyThecourse(499.00);
	if(status)
	{
		System.err.println("you have enrolled successfully ");
	}
	else
	{
		System.err.println("registration is failed");
	}
	}

}
