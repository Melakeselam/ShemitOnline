package com.codepow.webapplicatiion.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DerejeController {
	@GetMapping("/dereje")
	public String userAccount() {
		return "Dereje Kenno";
	}

}
