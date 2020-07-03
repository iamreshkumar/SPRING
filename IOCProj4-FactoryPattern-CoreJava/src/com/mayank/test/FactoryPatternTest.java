package com.mayank.test;

import com.mayank.comp.Car;
import com.mayank.factory.CarFactory;

public class FactoryPatternTest {
	public static void main(String[] args) {
		Car car=null;
		car=CarFactory.getInstance("luxory");
		car.drive();
		System.out.println("...................................");
		car=CarFactory.getInstance("budget");
		car.drive();
	}//main
}//class
