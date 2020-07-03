package com.mayank.factory;

import com.mayank.comp.ApolloTyre;
import com.mayank.comp.BudgetCar;
import com.mayank.comp.CEATTyre;
import com.mayank.comp.Car;
import com.mayank.comp.LuxoryCar;
import com.mayank.comp.MRFTyre;
import com.mayank.comp.SportsCar;
import com.mayank.comp.Tyre;

public class CarFactory {
	
	//factory method
	public  static  Car  getInstance(String  type) {
		 Tyre tyre=null;
		 Car car=null;
		 if(type.equalsIgnoreCase("luxory")) {
			 tyre=new CEATTyre();
			 car=new LuxoryCar(tyre);
		 }
		 else if(type.equalsIgnoreCase("sports")) {
			 tyre=new MRFTyre();
			 car=new SportsCar(tyre);
		 }
		 else if(type.equalsIgnoreCase("budget")) {
			 tyre=new ApolloTyre();
			 car=new BudgetCar(tyre);
		 }
		 else {
			 throw new IllegalArgumentException("Invalid Car type");
		 }
		return car;
	}//method

}//class
