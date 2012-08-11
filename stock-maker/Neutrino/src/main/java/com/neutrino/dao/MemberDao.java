package com.neutrino.dao;

import com.neutrino.model.Member;

public interface MemberDao {	
	public Member findById(String email);
	
	public Member persist(Member join);
}
