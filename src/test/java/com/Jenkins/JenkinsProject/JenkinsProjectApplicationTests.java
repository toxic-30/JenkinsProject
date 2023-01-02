package com.Jenkins.JenkinsProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsProjectApplicationTests {

	@Test
	public void testcontroller()
	{
		MainController maincontroller = new MainController();
		String result = maincontroller.message();
		assertEquals(result, "Good Morning");
	}	
		
		

}
