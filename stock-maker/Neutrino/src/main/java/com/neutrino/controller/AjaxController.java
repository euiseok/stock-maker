package com.neutrino.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neutrino.model.Result;
import com.neutrino.service.SingService;

@Controller
public class AjaxController {
	
	@Autowired
	SingService signService;	
	
	private static final Logger logger = LoggerFactory.getLogger(AjaxController.class);
	
	@RequestMapping(value="/sign/checkEmail/{email}", method=RequestMethod.GET)
	@ResponseBody
	public Result checkEmail(@PathVariable String email) {
		logger.info("[AJAX CALL] email check :" + email);
		
		Result result = new Result();
		if(signService.isRegisteredEmail(email)){
			result.setDuplicated(true);
		}else{
			result.setDuplicated(false);
		}
		return result;
	}
}
