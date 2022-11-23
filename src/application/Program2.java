package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department Update ===");
		Department dep2 = departmentDao.findById(1); 
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Update Complete!");
		
		System.out.println("\n=== TEST 2: Department Delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		sc.close();
		
		sc.close();
	}
}
