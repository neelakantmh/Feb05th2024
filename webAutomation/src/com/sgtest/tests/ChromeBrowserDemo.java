
package com.sgtest.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lanchBrowser();
		navigateURL();
		closeApplication();
	}
		private static void lanchBrowser() {
			try
			{
				oBrowser=new ChromeDriver();
			}catch(Exception e)
			{
				e.getStackTrace();
			}
		}
		private static void navigateURL(){
			try
			{
				oBrowser.get("http://localhost/login.do");
				Thread.sleep(5000);
			}catch(Exception e)
			{
				e.getStackTrace();
			}
		}
		private static void closeApplication() {
			try
			{
				oBrowser.quit();
			}catch(Exception e)
			{
				e.getStackTrace();
			}
		}
	}
