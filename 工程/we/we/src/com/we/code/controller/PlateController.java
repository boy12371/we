package com.we.code.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.we.code.com.CommonController;
import com.we.code.model.WePlate;
import com.we.code.service.api.PlateService;

/**
 * @name PlateController.java
 * TODO 
 * @author wqy
 * @time 2016年3月28日 上午10:33:19
 */
@Controller
public class PlateController extends CommonController{
	
	@Autowired
	PlateService plateService;
	
	/** 
	 * @Title: test 
	 * @Description: 测试
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 * @return: void
	 */
	@RequestMapping("test/login.do")
	public void test(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
		List<WePlate> list = plateService.getPlateList();
		if (list!=null&&list.size()>0) {
			System.err.println(list.get(0).getTitle());
		}
		
		rander("/page/index.html", req, resp);
	}

}
