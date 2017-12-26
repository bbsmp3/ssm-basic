package com.hou.ssmbasic.web;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hou.ssmbasic.service.AuthenticationService;
import com.hou.ssmbasic.vo.ResultVO;

@Controller
@RequestMapping(value="/auth")
public class AuthenticationController {
	
	@Autowired
	private AuthenticationService authenticationService;
	
	@RequestMapping(value="/auth",  method=RequestMethod.GET)
	public @ResponseBody ResultVO auth(
			@RequestParam("userType") int userType,
			@RequestParam("userId") String userId,
			@RequestParam("password") String password
			) {
		System.out.println("---");
		if(userType == 0){
			return authenticationService.authByNotesId(userId, password);
		}
		return null;
	}
	
	@RequestMapping(value = "/spring")
	public void spring(HttpServletResponse response) {
		try {
			response.getWriter().write("Hello, Spring");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
