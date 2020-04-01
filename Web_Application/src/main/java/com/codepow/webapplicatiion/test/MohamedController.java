package com.codepow.webapplicatiion.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MohamedController {
	
  @RequestMapping("/mhussein")
  public String getMohamed() {
	  String fullName="Mohamed Hussein Abdel Halim Mohamed  Soliman";
	  return fullName; 
  }
}
