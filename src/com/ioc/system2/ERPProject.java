package com.ioc.system2;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ioc.events.MyEventPublisher;

public class ERPProject implements Project, InitializingBean, DisposableBean{
@Autowired
MyEventPublisher publish;

	public ERPProject()
	{
		System.out.println("ERP project instatiated");
	}

	@Override
	public void details() {
		// TODO Auto-generated method stub
		System.out.println("ERP Project Started");
		publish.publish("Some data is published");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("After properties Set");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Finish task");
		
	}
	
	@PreDestroy
	public void destroy1()
	{
		System.out.println("Completed task");
	}

}
