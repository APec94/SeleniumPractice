package com.paxotech.qa.framework;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class ScriptBase {

	protected WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.navigate().to(new URL("http://qa1.paxotech.com/heatclinic/"));
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	public void login(String userID, String password) {

		WebElement loginLink = driver.findElement(By.xpath(".//*[@id='cart_info']/a[1]/span"));
		loginLink.click();

		WebElement userTextbox = driver.findElement(By.name("j_username"));
		// userTextbox.sendKeys("paxoqa1@gmail.com");
		userTextbox.sendKeys(userID);

		WebElement passwordTextbox = driver.findElement(By.name("j_password"));
		// passwordTextbox.sendKeys("paxotech");
		passwordTextbox.sendKeys(password);

		WebElement loginButton = driver.findElement(By.cssSelector(".login_button.big.red"));
		loginButton.click();
	}
	
	public void verifyLoginSuccess(String userName) {
		WebElement myAccountName = driver.findElement(By.cssSelector(".my-account"));
		String text = myAccountName.getText();

		Assert.assertEquals(text, userName);
	}
}
