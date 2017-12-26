package com.hou.ssmbasic.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AutowiredComponent {
	@Value("${test.string}")
	public String string;
	
	@Value("${test.integer}")
	public int integer;

	@Value("${hehe.heihei}")
	public String stringHeihei;
}
