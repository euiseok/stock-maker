package com.neutrino.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neutrino.controller.HomeController;
import com.neutrino.dao.MemberDao;
import com.neutrino.model.Member;

@Service
public class SignServiceImpl implements SingService {
	//Log
	private static final Logger logger = LoggerFactory.getLogger(SignServiceImpl.class);

	@Autowired
	MemberDao memberDao;
	
	/*
	 * Email 주소가 기존에 등록되어 있는지 확인 하는 메소드
	 * @see com.neutrino.service.SingService#isRegisteredEmail(java.lang.String)
	 */
	@Override
	public boolean isRegisteredEmail(String email) {
		logger.info("[ServiceImpl CALL] isRegisteredEmail :" + email);
		
		if(memberDao.findById(email)==null){
			return false;
		}else{
			return true;
		}
	}
	
	/*
	 * 회원정보 가입
	 * @see com.neutrino.service.SingService#join(com.neutrino.model.Member)
	 */
	@Override
	public Member join(Member member) {
		logger.info("[ServiceImpl CALL] join :" + member.toString());
		return memberDao.persist(member);
	}
}
