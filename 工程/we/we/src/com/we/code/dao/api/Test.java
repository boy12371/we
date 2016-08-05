/**   
 * 
 * @Title: Test.java 
 * @Prject: we
 * @Package: com.we.code.dao.api 
 * @Description: TODO
 * @author: wqy   
 * @date: 2016年4月11日 上午11:43:43 
 * @version: V1.0   
 */
package com.we.code.dao.api;

import com.we.code.model.WePlate;

/** 
 * @ClassName: Test 
 * @Description: TODO
 * @author: wqy
 * @date: 2016年4月11日 上午11:43:43  
 */
public interface Test extends MyBatisBatchDao {
	
	public WePlate queryById(int id);
	
	public WePlate getUser(WePlate wePlate);

}
