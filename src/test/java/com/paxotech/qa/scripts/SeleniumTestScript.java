package com.paxotech.qa.scripts;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.paxotech.qa.framework.ScriptBase;

import junit.framework.Assert;

public class SeleniumTestScript extends ScriptBase {

	@Test
	public void test() {

		login("paxoqa1@gmail.com", "paxotech");
		// login(); instead of hard coding username/password, we are setting a
		// variable here
		verifyLoginSuccess("Paxotech");

	}

}
