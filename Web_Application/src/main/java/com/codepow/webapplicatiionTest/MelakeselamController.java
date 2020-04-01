package com.codepow.webapplicatiionTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MelakeselamController {
	
	@RequestMapping("/Melak")
	public String getMelak() {
		return "Melakeselam Moges";
	}

}
