package com.hou.ssmbasic.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hou.ssmbasic.dao.UserDAO;
import com.hou.ssmbasic.entity.UserDO;
import com.hou.ssmbasic.service.AuthenticationService;
import com.hou.ssmbasic.util.LdapAuthenticator;
import com.hou.ssmbasic.vo.ResultVO;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	private UserDAO userDAO;
	@Autowired
	private AutowiredComponent autowiredComponent;
	private String string;	
	public int basicInteger;	
	
	
	public ResultVO authByNotesId(String notesId, String password) {
		
	    Logger logger = LoggerFactory.getLogger(AuthenticationServiceImpl.class);
	    logger.debug("logger:Hello world.");
//	    Logger myLogger = LoggerFactory.getLogger("myLogger");;
//	    myLogger.warn("myLogger:-------------------");
			
		ResultVO result = new ResultVO();
		UserDO user = userDAO.getUserByNotesId(notesId);
		if(user != null) {
			boolean authenticationResult = uniformAuthenticate(notesId, password);
			if(authenticationResult == true) {
				result.setCode("000");
				result.setMessage("验证成功");
				result.setNotesId(notesId);
				result.setRybh(user.getRybh());
			} else {
				result.setCode("100");
				result.setMessage("总行统一用户验证失败");
				result.setNotesId(notesId);
				result.setRybh(user.getRybh());
			}
		} else {
			result.setCode("101");
			result.setMessage("该Notes号未与工号绑定，请先使用工号登录");
			result.setNotesId(notesId);
			result.setRybh("");
		}
		return result;
	}
	
	private boolean uniformAuthenticate(String notesId, String password) {
		LdapAuthenticator authenticator = new LdapAuthenticator();
		boolean result = authenticator.ldapConnet(notesId, password);
		return result;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public int getBasicInteger() {
		return basicInteger;
	}

	public void setBasicInteger(int basicInteger) {
		this.basicInteger = basicInteger;
	}

}
