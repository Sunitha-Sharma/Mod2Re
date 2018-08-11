package com.cg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.beans.Query_Master;
import com.cg.services.UpdateServices;




@Controller
public class URIController {

	@Autowired(required=true)
	UpdateServices service;
	
	@RequestMapping("/")
	public String getIndexPage() {
		return "index";
		
		
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
public ModelAndView getUpdate(@ModelAttribute("query_master") Query_Master query_master) {
	Query_Master query_master1=service.getdetails(query_master.getQuery_id());
	
	ModelAndView modelAndView = new ModelAndView("details", "Query_Master", query_master);
	
	return modelAndView;
			
	}
	@RequestMapping(value="/updatedetails",method=RequestMethod.POST)
	public ModelAndView getUpdateDetails(@ModelAttribute("query_master1") Query_Master query_master1) {
		query_master1=service.updatedetails(query_master1);
		ModelAndView modelAndView = new ModelAndView("updateddetails", "Query_Master", query_master1);
		return modelAndView;
				
		}
	@ModelAttribute("query_master")
	public Query_Master getQuery_Master() {
	return new Query_Master();
}
	@ModelAttribute("query_master1")
	public Query_Master getQueryMaster1() {
	return new Query_Master();
}
}