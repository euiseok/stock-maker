package com.neutrino.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.neutrino.dao.MemberDao;

@Component
public class SignServiceImpl implements SingService {
	//Log
	private static final Logger logger = LoggerFactory.getLogger(SignServiceImpl.class);

	@Autowired
	MemberDao memberDao;
	
	@Override
	public boolean isRegisteredEmail(String email) {
		logger.info("[ServiceImpl CALL] isRegisteredEmail :" + email);
		
		if(memberDao.findById(email).equals(null)){
			return false;
		}else{
			return true;
		}
	}
}
