package com.hou.ssmbasic.dao;

import org.apache.ibatis.annotations.Param;

import com.hou.ssmbasic.entity.UserDO;

public interface UserDAO {

	public UserDO getUserByRybh(@Param("rybh") String rybh);

	public UserDO getUserByNotesId(@Param("notesId") String notesId);
	
}
