package com.test.demo;



import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class counterController{
	@RequestMapping("")

	public String show(HttpSession session) {
		if (session.isNew()) {
			 session.setAttribute("count", 0);
			 
			 
		}
		else {
		
		Integer count = (Integer) session.getAttribute("count");
		count++;
		session.setAttribute("count", count);
		
		
				
	}
		return "index.jsp";
	
	}
	@RequestMapping("/counter")
		public String counter(HttpSession session) {
		return "counter.jsp";
			
		
		
	
	}
	}
