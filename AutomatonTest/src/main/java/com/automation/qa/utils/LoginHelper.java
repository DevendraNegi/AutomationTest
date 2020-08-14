package com.automation.qa.utils;

import com.automation.qa.base.TestBase;


public class LoginHelper extends TestBase {

	public static String getUserName() {
		return TestBase.prop.getProperty("username");

	}

	public static String getPassWord() {
		return TestBase.prop.getProperty("password");

	}

}
