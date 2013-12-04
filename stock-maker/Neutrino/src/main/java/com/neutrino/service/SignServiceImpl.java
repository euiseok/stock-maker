package com.neutrino.service;

import java.sql.Date;
import java.text.SimpleDateFormat;

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
	 * Email 주소로 기존 가입정보 확인 - json
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
	 * 회원정보 DB 저장
	 * @see com.neutrino.service.SingService#join(com.neutrino.model.Member)
	 */
	@Override
	public void join(Member member){
		member.setJoindate(new Date(System.currentTimeMillis()));				//Get time
		logger.info("[ServiceImpl CALL] join :" + member.toString());				
		memberDao.persist(member);
	}
	
	/*
	 * 로그인
	 */
	@Override
	public Member login(Member member){
		logger.info("[ServiceImpl CALL] login :" + member.toString());
		Member loginMember = memberDao.login(member);
		//후처리 기능 추가
		if(loginMember!=null){
			logger.info("[Member] 최근 접속시간 update Dao 호출");
		}		
		return loginMember;
	}
}
