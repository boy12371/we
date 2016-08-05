/**
 * 
 */
package com.we.code.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.we.code.dao.api.PlateDao;
import com.we.code.dao.api.Test;
import com.we.code.model.WePlate;
import com.we.code.service.api.PlateService;

/**
 * @author wqy
 *
 */
@Service
public class PlateServiceImpl implements PlateService {
	@Autowired
	private PlateDao plateDao;
	
	
	@Autowired
	private Test test;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<WePlate> getPlateList() {
		
		WePlate instance= new  WePlate();
		
		instance.setId(1);
		WePlate rul = test.getUser(instance);
		System.err.println(rul.getTitle());
		// TODO 自动生成的方法存根
		return (List<WePlate>) plateDao.findByExample(instance);
	}

}
