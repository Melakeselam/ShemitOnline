package com.codepow.webapplicatiion.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MikeController {
	
	@RequestMapping("/mike")
	public String getMikeName()
	{
		
		return "Welcome Mike";   
	}

}
