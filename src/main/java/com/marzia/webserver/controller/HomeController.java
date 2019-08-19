package com.marzia.webserver.controller;



import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marzia.webserver.dao.model.PatientVisit;
import com.marzia.webserver.dao.model.PatientVisitExample;
import com.marzia.webserver.dao.model.Patients;
import com.marzia.webserver.dao.model.PatientsExample;
import com.marzia.webserver.dao.repository.PatientVisitMapper;
import com.marzia.webserver.dao.repository.PatientsMapper;

import sun.util.logging.resources.logging;



@Controller
public class HomeController {
	private static Logger log = Logger.getLogger(HomeController.class.getName());

	@Autowired
	 private PatientsMapper pm;
	
	@Autowired
	 private PatientVisitMapper pvm;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		log.info("home: " + req);
		return "home";
	}
	
	@RequestMapping(value = "/cases", method = RequestMethod.GET)
	public String cases(HttpServletRequest req) {
		log.info("cases: " + req);
		return "cases";
	}
	
	@RequestMapping(value = "/newPatient", method = RequestMethod.GET)
	public String newPatient( Model model) {
		model.addAttribute("newPatient", new Patients());
		return "newPatient";
	}
	
	@RequestMapping(value = "/newPatient", method = RequestMethod.POST)
	public String newPatientSubmit( @Valid Patients patients, BindingResult bindingResult,Model model,@RequestParam("cell") String cell,
			@RequestParam(value="since") @DateTimeFormat(pattern="MMddyyyy") String date) {
		return "result";
	}
	
	@ResponseBody
	@RequestMapping(value = "/newPatientSubmit", method = RequestMethod.POST)
	public List<Patients> newPatientSubmitButton( @Valid Patients patients, BindingResult bindingResult,Model model,@RequestParam("cell") String cell,
			@RequestParam(value="since") @DateTimeFormat(pattern="MMddyyyy") String date ) {
		PatientsExample pe = new PatientsExample();
		pe.createCriteria().andFirstnameEqualTo(patients.getFirstname())
		.andLastnameEqualTo(patients.getLastname());
		List<Patients> patient = pm.selectByExample(pe); 
		if(patient.isEmpty()) {
			pm.insert(patients);	
		}
		
		return patient;
	}
	
	@ResponseBody
	@RequestMapping(value = "/patientList", method = RequestMethod.GET)
	public List<Patients> patientList(
			) {		
		PatientsExample pe = new PatientsExample();
		pe.createCriteria().getAllCriteria();
		List<Patients> patient = pm.selectByExample(pe); 
		return patient;
	
	}
	
	@RequestMapping(value = "/logOut", method = RequestMethod.GET)
	public String logOut(HttpServletRequest req) {
		log.info("logOut: " + req);
		return "logout";
	}

	@ResponseBody
	@RequestMapping(value = "/PatientSearch", method = RequestMethod.GET)
	public List<Patients> PatientSearch(
			@RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname,
			@RequestParam("cell") String cell,
			@RequestParam("email") String email,
			@RequestParam("address") String address,
			@RequestParam("fileno") String fileno,
			@RequestParam("barcode") String barcode,
			@RequestParam("casenumber") Integer casenumber) {
		
		PatientsExample pe = new PatientsExample();
		List<Patients> patient;
		log.info("cell == " + cell + " =email= "+email+" =fileno= "+fileno );
		if(firstname != "" || lastname != ""|| cell != "" || email != "" || address != "" || fileno != "" || barcode != "") {
			pe.createCriteria().andFirstnameLikeInsensitive(firstname+"%").andLastnameLikeInsensitive(lastname+"%").andCellLikeInsensitive(cell+"%").andEmailLikeInsensitive(email+"%").andAddressLikeInsensitive(address+"%").andFilenoLikeInsensitive(fileno+"%").andBarcodeLikeInsensitive(barcode+"%");
		}else if(casenumber != null) {
			pe.createCriteria().andCasenumberEqualTo(casenumber);
		}
		
		patient = pm.selectByExample(pe);
		return patient;
	}

	
	@ResponseBody
	@RequestMapping(value = "/ViewDetail", method = RequestMethod.GET)
	public Patients ViewDetail(@RequestParam("pk") Integer pk) {
		Patients patient; 
		patient =  pm.selectByPrimaryKey(pk);
		return patient;
	}
	
	@ResponseBody
	@RequestMapping(value = "/saveVisit", method = RequestMethod.GET)
	public List<PatientVisit> saveVisit(@Valid PatientVisit patientvisit,BindingResult bindingResult,Model model,
			@RequestParam(value="visitdate") @DateTimeFormat(pattern="MMddyyyy") String visitdate) {
		PatientVisitExample pve = new PatientVisitExample();
		List<PatientVisit> patient = null; 
		log.info("save visit = " + model);
		return patient;
	}
	
}
