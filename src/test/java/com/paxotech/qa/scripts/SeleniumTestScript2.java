package com.paxotech.qa.scripts;

import org.junit.Test;
import com.paxotech.qa.framework.ScriptBase;

public class SeleniumTestScript2 extends ScriptBase{

	@Test
	public void test(){
		login("paxoqa1@gmail.com","paxotech");
		verifyLoginSuccess("Paxotech");
		
		
	}
	
}
