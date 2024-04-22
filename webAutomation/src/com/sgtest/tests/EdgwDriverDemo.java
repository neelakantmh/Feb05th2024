package com.sgtest.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EdgwDriverDemo {


		 public static  WebDriver oBrowser=null;
			public static void main(String[] args) {
				lanchBrowser();
				navigateURL();
				closeApplication();
			}
			private static void lanchBrowser() {
				try {
					oBrowser=new EdgeDriver();
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void navigateURL() {
				try {
					oBrowser.get("https://online.actitime.com/neelakant/login.do");
					Thread.sleep(5000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void closeApplication () {
				try {
					oBrowser.close();
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			
			
		


	}

}
