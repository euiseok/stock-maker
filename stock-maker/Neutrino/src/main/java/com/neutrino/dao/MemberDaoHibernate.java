package com.neutrino.dao;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.HibernateException;
import org.hibernate.NonUniqueResultException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.neutrino.model.Member;

@Repository
public class MemberDaoHibernate implements MemberDao{

	private static final Logger logger = LoggerFactory.getLogger(MemberDaoHibernate.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * Hibernate named query - Member Entity
	 * @see com.neutrino.dao.MemberDao#findById(java.lang.String)
	 */
	@Override
	public Member findById(final String email) {
		logger.info("[Hibernate] findById:" + email);
		
		Query query = sessionFactory.getCurrentSession().getNamedQuery("com.neutrino.model.memberByEmail");
		query.setString("email",email);
		
		return  (Member)query.uniqueResult();
	}
	
	/*
	 * Hibernate API 
	 * merge : 회원가입 - hibernate로 구현 함
	 * @see com.neutrino.dao.MemberDao#save(com.neutrino.model.Member)
	 */
	@Override
	public void persist(Member member) {
		logger.info("[Hibernate] persist:" + member.toString());
		
		try{
			sessionFactory.getCurrentSession().save(member);
		}catch(NonUniqueResultException nure){
			logger.debug("[Hibernate] persist:" + member.toString());
		}catch(HibernateException he){
			logger.error("[Hibernate] Selete Exception:" + he.toString());
		}catch(Exception e){
			logger.error("[System] Exception:" + e.toString());
		}
	}
	
	/*
	 * Hibernate API 
	 * merge : 회원가입 - hibernate로 구현 함
	 * @see com.neutrino.dao.MemberDao#save(com.neutrino.model.Member)
	 */
	@Override
	public Member login(Member member) {
		Query query = sessionFactory.getCurrentSession().getNamedQuery("com.neutrino.model.login");
		query.setString("email",member.getEmail());
		query.setString("password",member.getPassword());
		
		try{
			member = (Member)query.uniqueResult();
		}catch(NonUniqueResultException nure){
			logger.debug("[Hibernate] persist:" + member.toString());
		}catch(HibernateException he){
			logger.error("[Hibernate] Selete Exception:" + he.toString());
		}catch(Exception e){
			logger.error("[System] Exception:" + e.toString());
		}		
		
		return  member;
	}
}