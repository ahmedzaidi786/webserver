package com.marzia.webserver.controller;



import java.util.Date;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marzia.webserver.dao.model.Patients;



@Controller
public class HomeController {
	private static Logger log = Logger.getLogger(HomeController.class.getName());

	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		log.info("home: " + req);
		return "home";
	}
	
	@RequestMapping(value = "/newPatient", method = RequestMethod.GET)
	public String newPatient( Model model) {
		model.addAttribute("newPatient", new Patients());
		log.info("Firstname =" +model);
		return "newPatient";
	}
	
	@RequestMapping(value = "/newPatient", method = RequestMethod.POST)
	public String newPatientSubmit( @Valid Patients patients, BindingResult bindingResult,Model model,@RequestParam("mobile") String mobile,
			@RequestParam(value="since") @DateTimeFormat(pattern="MMddyyyy") String date ) {
		log.info("Mobile =" + mobile);
		log.info("Date =" + date);
		log.info("Mobile object =" + patients.getMobile());
		return "result";
	}
	
	@ResponseBody
	@RequestMapping(value = "/newPatientSubmit", method = RequestMethod.POST)
	public Patients newPatientSubmitButton( @Valid Patients patients, BindingResult bindingResult,Model model,@RequestParam("mobile") String mobile,
			@RequestParam(value="since") @DateTimeFormat(pattern="MMddyyyy") String date ) {
		log.info("Mobile =" + mobile);
		log.info("Date =" + date);
		log.info("object =" + patients.toString());
		return patients;
	}
	@RequestMapping(value = "/logOut", method = RequestMethod.GET)
	public String logOut(HttpServletRequest req) {
		log.info("logOut: " + req);
		return "logout";
	}
}
