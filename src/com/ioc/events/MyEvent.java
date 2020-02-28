package com.ioc.events;

	import org.springframework.context.ApplicationEvent;

	import org.springframework.stereotype.Component;

	public class MyEvent  extends ApplicationEvent{

		public MyEvent(Object source) {
				super(source);

			}	

		public String toString(){

		    return "My Event has occured"+ this.source;

		}



	}


