package com.hou.ssmbasic.annotation;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hou.ssmbasic.service.AuthenticationService;
import com.hou.ssmbasic.service.impl.AuthenticationServiceImpl;
import com.hou.ssmbasic.vo.ResultVO;

public class AnnotationTest extends BaseTest {

	@Autowired
	private AuthenticationServiceImpl service;
	@Autowired
	private AuthenticationService service1;
	@Autowired
	private AutowiredThing at;
	@Autowired
	private AutowiredComponent acc;
	
	@Test
	public void testService() {
		service.setString("111");
		System.out.println(service.getString());
		System.out.println(service1.getString());		
	}
	
	@Test 
	public void testAutowired() {
		System.out.println("testAutowired");
		System.out.println(at.ac.string);
		acc.string = "acc changed";
		System.out.println(at.ac.string);
	}
	
	@Test 
	public void testValue() {
		System.out.println("acc.string:" + acc.string);
		System.out.println("acc.integer:" + acc.integer);
		System.out.println("acc.stringHeihei:" + acc.stringHeihei);
	}
}
