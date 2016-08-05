/**   
 * 
 * @Title: TestImpl.java 
 * @Prject: we
 * @Package: com.we.code.dao.impl 
 * @Description: TODO
 * @author: wqy   
 * @date: 2016年4月28日 下午4:29:47 
 * @version: V1.0   
 */
package com.we.code.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import com.we.code.dao.api.Test;
import com.we.code.model.WePlate;

/** 
 * @ClassName: TestImpl 
 * @Description: TODO
 * @author: wqy
 * @date: 2016年4月28日 下午4:29:47  
 */
public class TestImpl implements Test {
	public SqlSessionTemplate sqlSession; 

	/** 
	 * @Title: queryById 
	 * @Description: TODO
	 * @param id
	 * @return
	 * @see com.we.code.dao.api.Test#queryById(int)
	 */
	@Override
	public WePlate queryById(int id) {
		// TODO 自动生成的方法存根
		sqlSession.
		return null;
	}

	/** 
	 * @Title: getUser 
	 * @Description: TODO
	 * @param wePlate
	 * @return
	 * @see com.we.code.dao.api.Test#getUser(com.we.code.model.WePlate)
	 */
	@Override
	public WePlate getUser(WePlate wePlate) {
		// TODO 自动生成的方法存根
		return null;
	}


}
