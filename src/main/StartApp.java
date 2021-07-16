package main;

import java.util.Date;
import java.util.List;

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
		
		System.out.println("\n-------TEST02: seller findByDepartment-------");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n-------TEST03: seller findAll-------");
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n-------TEST04: seller insert-------");
		//Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		//sellerDao.insert(newSeller);
		//System.out.println("Inserted! New id: " + newSeller.getId());
		
		
		System.out.println("\n-------TEST05: seller update-------");
		seller = sellerDao.findById(1);
		seller.setName("Bruce Wayne");
		sellerDao.update(seller);
		System.out.println("Update Completed");
		
		System.out.println("\n-------TEST06: seller delete-------");
		sellerDao.deleteById(11);
		System.out.println("Delete completed!");
	}

}
