package com.mayank.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.mayank.comp.BlueDart;
import com.mayank.comp.Courier;
import com.mayank.comp.DTDC;
import com.mayank.comp.FirstFlight;
import com.mayank.comp.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	static{
		InputStream is=null;
		try {
			//Locate Properties using streams
			is=new FileInputStream("src/com/mayank/commons/info.properties");
			//Load Properties file into java.util.Properties object
			props=new Properties();
			props.load(is);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//stati block
	
	//Factory method
	public    static  Flipkart   getInstance()throws Exception {
		  Courier courier=null;
		  Flipkart fpkt=null;
		  //get Dependent class  and create  class object 
		   courier=(Courier) Class.forName(props.getProperty("sdp.dependent")).newInstance();  
		  //create Target class object
		  fpkt=new Flipkart();
		  //assign depedent class object to taget class object
		  fpkt.setCourier(courier);
		  return  fpkt;
	}//method

}//class
