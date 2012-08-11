package com.neutrino.service;

import org.springframework.transaction.annotation.Transactional;

import com.neutrino.model.Member;

@Transactional
public interface SingService {
	@Transactional(readOnly=true)
	public boolean isRegisteredEmail(String email);
	
	public Member join(Member member);
}