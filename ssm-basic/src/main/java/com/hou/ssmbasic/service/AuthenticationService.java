package com.hou.ssmbasic.service;

import com.hou.ssmbasic.vo.ResultVO;

public interface AuthenticationService {
	
	public ResultVO authByNotesId(String notesId, String password);
	
	public String getString();
	
}
