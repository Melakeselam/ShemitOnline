package com.codepow.webapplicatiion.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class AccountController {
@RequestMapping(value="profile",method=RequestMethod.GET)
public String profile() {
	return "admin.account.index";
}
}
