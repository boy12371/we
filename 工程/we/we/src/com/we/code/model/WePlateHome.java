/*package com.we.code.model;

// default package
// Generated 2016-3-28 9:03:17 by Hibernate Tools 4.0.0.Final

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;

*//**
 * Home object for domain model class WePlate.
 * @see .WePlate
 * @author Hibernate Tools
 *//*
public class WePlateHome {

	private static final Log log = LogFactory.getLog(WePlateHome.class);

	private SessionFactory sessionFactory;
    
    @Autowired
    public void setSessionFacotry(SessionFactory sessionFacotry) {
		super.setSessionFactory(sessionFacotry);
	}  
    @SuppressWarnings("unused")
	private Session currentSession(){  
        return this.sessionFactory.getCurrentSession();  
    } 

	public void persist(WePlate transientInstance) {
		log.debug("persisting WePlate instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(WePlate instance) {
		log.debug("attaching dirty WePlate instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WePlate instance) {
		log.debug("attaching clean WePlate instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(WePlate persistentInstance) {
		log.debug("deleting WePlate instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public WePlate merge(WePlate detachedInstance) {
		log.debug("merging WePlate instance");
		try {
			WePlate result = (WePlate) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public WePlate findById(java.lang.Integer id) {
		log.debug("getting WePlate instance with id: " + id);
		try {
			WePlate instance = (WePlate) sessionFactory.getCurrentSession().get("WePlate", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<?> findByExample(WePlate instance) {
		log.debug("finding WePlate instance by example");
		try {
			List<?> results = sessionFactory.getCurrentSession().createCriteria("com.we.code.model.WePlate").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
*/