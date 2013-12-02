package com.neutrino.service;

import org.springframework.transaction.annotation.Transactional;

import com.neutrino.model.Member;

@Transactional
public interface SingService {
	@Transactional(readOnly=true)
	public boolean isRegisteredEmail(String email);
	
	public void join(Member member);
}