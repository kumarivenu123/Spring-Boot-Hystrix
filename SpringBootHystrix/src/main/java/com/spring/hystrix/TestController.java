package com.spring.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	private TestService testSerivce;
	
	@GetMapping("/test")
	public String testService() throws Exception {
		return testSerivce.test();
	}

}
