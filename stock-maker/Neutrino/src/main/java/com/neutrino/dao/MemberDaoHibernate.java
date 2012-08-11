package com.neutrino.dao;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.neutrino.model.Member;

@Repository
public class MemberDaoHibernate extends HibernateDaoSupport implements MemberDao{

	private static final Logger logger = LoggerFactory.getLogger(MemberDaoHibernate.class);
	
	/*
	 * Hibernate named query - Member Entity
	 * @see com.neutrino.dao.MemberDao#findById(java.lang.String)
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Member findById(final String email) {
		logger.info("[Hibernate] findById:" + email);
		return (Member)getHibernateTemplate().execute(new HibernateCallback(){
			@Override
			public Object doInHibernate(Session session){
				Query query = getSession().getNamedQuery("com.neutrino.model.memberByEmail");
				query.setString("email",email);
				return (Member)query.uniqueResult();
			}});
	}
	
	/*
	 * Hibernate API 
	 * merge : �ش� ID�� ���� �����ϸ� �ش� ��ü ����, �ش� ���� ������ ����
	 * @see com.neutrino.dao.MemberDao#save(com.neutrino.model.Member)
	 */
	@Override
	public Member persist(Member member) {
		logger.info("[Hibernate] persist:" + member.toString());
		return (Member)getHibernateTemplate().merge(member);
	}
}