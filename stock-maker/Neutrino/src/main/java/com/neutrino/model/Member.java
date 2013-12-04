package com.neutrino.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="MEMBER")
@NamedQueries({
	@NamedQuery(name="com.neutrino.model.memberByEmail",
			query="from Member as member where email=:email"
	),	
	@NamedQuery(name="com.neutrino.model.login",
			query="from Member as member where email=:email and password = :password"
	)
})
public class Member {
	@Id
	@Column(name="EMAIL",length=50)
	private String email;
	
	@Column(name="NAME",length=50,nullable=false)
	private String name;
	
	@Column(name="PASSWORD",length=20,nullable=false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Region region;
	
	@Temporal(TemporalType.DATE)
	@Column(name="JOINDATE",nullable=false)
	private Date joindate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="LAST_ACCESS_DATE",nullable=true)
	private Date lastAcessDate;
	
	public Member(){}
	
	public Member(String email, String name, String password, Region region,
			Date joindate, Date lastAcessDate) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.region = region;
		this.joindate = joindate;
		this.lastAcessDate = lastAcessDate;
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

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	
	public Date getLastAcessDate() {
		return lastAcessDate;
	}

	public void setLastAcessDate(Date lastAcessDate) {
		this.lastAcessDate = lastAcessDate;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[Member/")
		.append("email:"+this.email)
		.append(",name:"+this.name)
		.append(",password:"+this.password)
		.append(",region:"+this.region)
		.append(",joindate:"+this.joindate)
		.append(",lastAcessDate:"+this.lastAcessDate+"]");
		
		return sb.toString();
	}
}