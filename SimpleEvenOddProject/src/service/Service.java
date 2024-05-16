package service;

import dao.Dao;

public class Service {
	
	public void m1() {
		Dao dd=new Dao();
		int a=dd.m1();
		if(a%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}

}
