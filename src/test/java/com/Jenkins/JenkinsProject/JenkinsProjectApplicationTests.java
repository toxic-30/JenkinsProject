package com.Jenkins.JenkinsProject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.Jenkins.JenkinsProject.controller.MainController;

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
