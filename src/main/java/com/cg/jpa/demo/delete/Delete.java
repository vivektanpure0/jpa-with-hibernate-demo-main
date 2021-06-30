package com.cg.jpa.demo.delete;

	public class Delete {
		//	int num;
	private static Delete delete = new Delete();
	
	private Delete(){
	
	}
	
	public static Delete getInstance() {
		
		return delete;
		
	}
	
	} 