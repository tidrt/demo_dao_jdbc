package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao(); 
		
		System.out.println("=== TEST 1: Seller FindById ===");
		Seller seller = sellerDao.findById(3); 
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: Seller FindByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department); 
		// for every seller obj in our list;
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: Seller FindAll ===");
		list = sellerDao.findAll(); 
		// for every seller obj in our list;
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		/* System.out.println("\n=== TEST 4: Seller Inserted ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId()); */
		
		System.out.println("\n=== TEST 5: Seller Updated ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha");
		sellerDao.update(seller);
		System.out.println("Update Complete!");
	}
}
