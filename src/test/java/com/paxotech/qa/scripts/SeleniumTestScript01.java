package com.paxotech.qa.scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTestScript01 {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new FirefoxDriver();
		driver.navigate().to(new URL("http://qa1.paxotech.com/heatclinic/"));

		WebElement loginLink = driver.findElement(By.xpath(".//*[@id='cart_info']/a[1]/span"));
		loginLink.click();

		WebElement userTextbox = driver.findElement(By.name("j_username"));
		userTextbox.sendKeys("paxoqa1@gmail.com");

		// REMEMBER TO SET VARIABLES FOR EACH TEXTBOX/BUTTON/WHAT YOURE TRYING
		// TO VERIFY***

		WebElement passwordTextbox = driver.findElement(By.name("j_password"));
		passwordTextbox.sendKeys("paxotech");

		WebElement loginButton = driver.findElement(By.cssSelector(".login_button.big.red"));
		loginButton.click();

		WebElement myAccountName = driver.findElement(By.cssSelector(".my-account"));
		String text = myAccountName.getText();

		if (text.contentEquals("Paxotech")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");

		}

		driver.close();
		driver.quit();
	}
}

//THIS IS A BASIC VERSION OF WHAT IS NOW DEVIDED BETWEEN "SeleniumTestScript" and "ScriptBase"
