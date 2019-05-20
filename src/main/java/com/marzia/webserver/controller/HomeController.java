package com.marzia.webserver.controller;


import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marzia.webserver.dao.repository.PatientVisitMapper;
import com.marzia.webserver.dao.repository.PatientsMapper;
import com.marzia.webserver.dao.repository.RateBookMapper;



@Controller
public class HomeController {
	private static Logger log = Logger.getLogger(HomeController.class.getName());
	
	@Autowired
	private PatientsMapper pm;
	
	@Autowired
	private PatientVisitMapper pvm;
	
	@Autowired
	private RateBookMapper rbm;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		log.info("home: " + req);
		return "home";
	}
}
