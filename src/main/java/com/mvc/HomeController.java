package com.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.models.User;


@RestController
public class HomeController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome() {
		System.out.println("goHome");
		return "home";
		//return new ModelAndView("home");
	}
	
	@RequestMapping(value="/OK", method=RequestMethod.GET)
	public String goOK(@RequestParam("g") String getData) {
		System.out.println("get data from request.."+getData);
		return "OK";
	}
	
	@RequestMapping(value="/getJson", method=RequestMethod.GET)
	public @ResponseBody User jsonReturn() {
		System.out.println("goHome");
		User u = new User();
		u.setFirstName("taraq");
		u.setLastName("taraq");
		u.setAge("22");
		return u;
		
	}
	
	@RequestMapping(value="/homeWS", method=RequestMethod.GET)
	public ModelAndView goHomeMV(Model model) {
		System.out.println("goHomeSWS");
		return new ModelAndView("home");
	}
}
