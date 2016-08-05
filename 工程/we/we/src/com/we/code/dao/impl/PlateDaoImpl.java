/**
 * 
 */
package com.we.code.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.we.code.dao.api.PlateDao;
import com.we.code.model.WePlate;

/**
 * @author wqy
 *
 */
/** 
 * @ClassName: PlateDaoImpl 
 * @Description: TODO
 * @author: wqy
 * @date: 2016年3月28日 下午5:11:11  
 */
@Transactional
@Repository
public class PlateDaoImpl extends HibernateDaoSupport  implements PlateDao {
	
	private static final Log log = LogFactory.getLog(PlateDaoImpl.class);

	@Resource  
    public void setMySessionFactory(SessionFactory sessionFactory){  
        super.setSessionFactory(sessionFactory);  
    }
	/* （非 Javadoc）
	 * @see com.we.code.dao.api.PlateDao#getPlateList()
	 */
	@Override
	public void persist(WePlate transientInstance) {
		log.debug("persisting WePlate instance");
		try {
			getSessionFactory().getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	@Override
	public void attachDirty(WePlate instance) {
		log.debug("attaching dirty WePlate instance");
		try {
			getSessionFactory().getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	@Override
	public void attachClean(WePlate instance) {
		log.debug("attaching clean WePlate instance");
		try {
			getSessionFactory().getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	@Override
	public void delete(WePlate persistentInstance) {
		log.debug("deleting WePlate instance");
		try {
			getSessionFactory().getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	@Override
	public WePlate merge(WePlate detachedInstance) {
		log.debug("merging WePlate instance");
		try {
			WePlate result = (WePlate) getSessionFactory().getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	@Override
	public WePlate findById(Integer id) {
		log.debug("getting WePlate instance with id: " + id);
		try {
			WePlate instance = (WePlate) getSessionFactory().getCurrentSession().get("WePlate", id);
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

	
	/** 
	 * @Title: findByExample 
	 * @Description: TODO
	 * @param instance
	 * @return
	 * @see com.we.code.dao.api.PlateDao#findByExample(com.we.code.model.WePlate)
	 */
	@Override
	public List<?> findByExample(WePlate instance) {
		log.debug("finding WePlate instance by example");
		try {
			List<?> results = getSessionFactory().getCurrentSession().createCriteria(WePlate.class).add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
