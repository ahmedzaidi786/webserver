package com.marzia.webserver.controller;


import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class HomeController {
	private static Logger log = Logger.getLogger(HomeController.class.getName());
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		log.info("home: " + req);
		return "home";
	}
}
