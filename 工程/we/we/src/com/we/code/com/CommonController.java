/**
 * 
 */
package com.we.code.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @name CommonController.java
 * TODO 公共CommonController
 * @author wqy
 * @time 2016年3月28日 上午10:27:21
 */
public class CommonController {

	public void rander(String templeteUrl,HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
		req.getRequestDispatcher(templeteUrl).forward(req, resp);
	}
}
