package com.sun.appium.fgoal.objects;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * @author CHIRAG
 *
 */
public class LoginPageObject {

	private AndroidDriver driver;

	public LoginPageObject(AndroidDriver driver) {
		this.driver = driver;
	}

	@AndroidFindBy(id = "com.framgia.fgoal.stg:id/edit_username")
	public MobileElement usernameTextField;

	@AndroidFindBy(id = "com.framgia.fgoal.stg:id/edit_password")
	public MobileElement passwordTextField;

	// @AndroidFindBy(xpath = "//*[@text='Sign
	// in']/../following::android.widget.TextView[1]")
	@AndroidFindBy(id = "com.framgia.fgoal.stg:id/text_login")
	public MobileElement loginButton;

	public MobileElement getToolbar() {
		return (MobileElement) driver.findElement(By.id("com.framgia.fgoal.stg:id/toolbar_title"));
	}
	
	public MobileElement getEmptyEmail() {
		MobileElement returnElement = null;
		MobileElement userNameBox = (MobileElement) driver.findElement(By.id("com.framgia.fgoal.stg:id/edit_layout_username"));
		MobileElement emptyLayout = userNameBox.findElementByClassName("android.widget.LinearLayout");
		try
		{
			returnElement = (MobileElement) emptyLayout.findElement(By.id("com.framgia.fgoal.stg:id/textinput_error"));
		}
		catch (Exception ex)
		{
			returnElement = null;
		}
		return returnElement;
	}
	
	public MobileElement getEmptyPassword() {
		MobileElement returnElement = null;
		MobileElement passwordBox = (MobileElement) driver.findElement(By.id("com.framgia.fgoal.stg:id/edit_layout_password"));
		MobileElement emptyLayout = passwordBox.findElementByClassName("android.widget.LinearLayout");
		try
		{
			returnElement = (MobileElement) emptyLayout.findElement(By.id("com.framgia.fgoal.stg:id/textinput_error"));
		}
		catch (Exception ex)
		{
			returnElement = null;
		}
		return returnElement;
	}
}
