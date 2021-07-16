package main;

import java.util.Date;

import model_dao.DaoFactory;
import model_dao.SellerDao;
import model_entities.Department;
import model_entities.Seller;

public class StartApp {
	
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("\n-------TEST01: seller findById-------");
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);
		
	}

}
