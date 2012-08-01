package com.neutrino.service;

import org.springframework.transaction.annotation.Transactional;

public interface SingService {
	@Transactional(readOnly=true)
	public boolean isRegisteredEmail(String email);
}
