package com.neutrino.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="MEMBER")
public class Member {
	@Id
	@Column(name="EMAIL",length=50)
	private String email;
	
	@Column(name="NAME",length=50,nullable=false)
	private String name;
	
	@Column(name="PASSWORD",length=20,nullable=false)
	private String password;
	
	@Column(name="REGION",length=2)
	private String region;
	
	@Temporal(TemporalType.DATE)
	@Column(name="JOINDATE",nullable=false)
	private Date joindate;
	
	public Member(String email, String name, String password, String region,
			Date joindate) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.region = region;
		this.joindate = joindate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
}