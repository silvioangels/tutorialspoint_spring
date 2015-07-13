package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

	   @RequestMapping(value = "/", method = RequestMethod.GET)
	   public String index() {
		   return "index";
	   }
	   
	   @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	   public String redirect() {
	     
	      return "redirect:/pages/final.html";
	   }
	
}
