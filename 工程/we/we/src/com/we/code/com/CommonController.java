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
 * TODO ����CommonController
 * @author wqy
 * @time 2016��3��28�� ����10:27:21
 */
public class CommonController {

	public void rander(String templeteUrl,HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
		req.getRequestDispatcher(templeteUrl).forward(req, resp);
	}
}
