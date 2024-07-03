package com.tka.DemoSpring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@RequestMapping("/first")
	public String Firstapi() {
		return "My first Api..";
	}

}
