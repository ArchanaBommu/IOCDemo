package com.ioc.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ABCCompany implements Company {


	private BusinessOperation branch;
	
	@Autowired
	@Qualifier("tasks")
	private List<Process> tasks;
	
	
	
	public BusinessOperation getBranch() {
		return branch;
	}
	public void setBranch(BusinessOperation branch) {
		this.branch = branch;
	}
	public BusinessOperation getManufacturing() {
		return manufacturing;
	}
	public void setManufacturing(BusinessOperation manufacturing) {
		this.manufacturing = manufacturing;
	}
	private BusinessOperation manufacturing;
	public void establish(String name) {
		// TODO Auto-generated method stub
		
		System.out.println(name+"company is established");
		
		branch.perform("Chennai");
		manufacturing.perform("Tyre Maufacturing");
		String[] tasktypes = {
				"Quarter 1", "Pen and Pencil"};
		for(int i=0;i<tasks.size();i++)
		{
			tasks.get(i).process(tasktypes[i]);
		}
		
	}

}
