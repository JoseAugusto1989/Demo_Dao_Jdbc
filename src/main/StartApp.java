package main;

import java.util.Date;

import model_entities.Department;
import model_entities.Seller;

public class StartApp {
	
	public static void main(String[] args) {
		
		Department dep = new Department(1, "Books");
		
		Seller sel = new Seller(21, "Marcos", "Marc@gmail.com", new Date(), 3000.0, dep);
		
		System.out.println(sel);
		
	}

}
