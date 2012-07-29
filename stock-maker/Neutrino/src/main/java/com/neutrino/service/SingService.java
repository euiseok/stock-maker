package com.neutrino.service;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface SingService {
	@Transactional(readOnly=true)
	public boolean isRegisteredEmail(String email);
}
