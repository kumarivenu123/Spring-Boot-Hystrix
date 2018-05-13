package com.spring.hystrix;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TestService {

	@HystrixCommand(fallbackMethod = "testFallBack", commandKey = "test", groupKey = "test")
	public String test() throws Exception {
		String result = null;
		Integer value = RandomUtils.nextInt(10);
		System.out.println(value);
		if (value == 5) {
			throw new Exception();
		} else {
			result = "with out hystrix";
		}
		return result;
	}
	
	public String testFallBack() {
		return "With Hystrix Response";
	}

}
