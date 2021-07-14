package main;

import model_entities.Department;

public class StartApp {
	
	public static void main(String[] args) {
		
		Department dep = new Department(1, "Books");
		System.out.println(dep);
		
	}

}
