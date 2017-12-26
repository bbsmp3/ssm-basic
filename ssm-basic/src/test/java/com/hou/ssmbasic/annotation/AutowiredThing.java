package com.hou.ssmbasic.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredThing {
	
	@Autowired
	public AutowiredComponent ac;

}
