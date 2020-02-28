package com.ioc.system;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Qualifier("tasks")
@Order(1)
public class Accounting implements Process{

	@Override
	public void process(String name) {
		// TODO Auto-generated method stub
		System.out.println("Managing Accounts" +name);
		
	}

}
