package com.neutrino.dao;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.neutrino.model.Member;

public class MemberDaoHibernate extends HibernateDaoSupport implements MemberDao{

	private static final Logger logger = LoggerFactory.getLogger(MemberDaoHibernate.class);
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
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
}
