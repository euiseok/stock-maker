package com.neutrino.dao.impl;

import org.springframework.stereotype.Component;

import com.neutrino.dao.MemberDao;
import com.neutrino.model.Member;

@Component
public class MemberDaoJPA implements MemberDao {

	@Override
	public Member findById(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
