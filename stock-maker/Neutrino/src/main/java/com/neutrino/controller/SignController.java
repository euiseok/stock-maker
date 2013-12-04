package com.neutrino.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neutrino.model.Member;
import com.neutrino.model.Result;
import com.neutrino.service.SingService;

@Controller
public class SignController {
	
	@Autowired
	SingService signService;	
	
	private static final Logger logger = LoggerFactory.getLogger(SignController.class);
	
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
	
	@RequestMapping(value="/sign/join", method=RequestMethod.POST)
	public String join(@ModelAttribute Member member,BindingResult bindingResult) {
		signService.join(member);
		return "/login";
	}
	
	@RequestMapping(value="/sign/login", method=RequestMethod.POST)
	public String login(@ModelAttribute Member member,BindingResult bindingResult,Model model) {
		member = signService.login(member);
		
		if(member != null){			
			logger.info("^_________________________________________________________________^");			
			logger.info(member.getEmail() + "닙 환영합니다.  가입일 : "+ member.getJoindate()  + "접속하신 지역은  " + member.getRegion().name() + "입니다.");
			logger.info("Have a Fun!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//로그인 관련 정보를 SET함
			model.addAttribute(member);
			return "sign/mypage";
		}else{
			logger.info("orz_ __ _ _ _  _ _ _ _ ____________________________________________");
			logger.info("Please retry!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//로그인 오류 정보를 SET해서 화면에서 javaScript로 오류 메시지 출력 함			
			return "/login";
		}
	}
}
