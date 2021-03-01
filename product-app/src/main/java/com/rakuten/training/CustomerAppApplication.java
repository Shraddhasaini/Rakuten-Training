package com.rakuten.training;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rakuten.training.dal.CustomerDAO;
import com.rakuten.training.domain.Customers;

@SpringBootApplication
public class CustomerAppApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer =
		SpringApplication.run(CustomerAppApplication.class, args);
	
		testFullCustomersDAO(springContainer);
	}

	private static void testFullCustomersDAO(ApplicationContext springContainer) {
		CustomerDAO dao = springContainer.getBean(CustomerDAO.class);
		Customers aCustomers = new Customers("Shraddha","Saini","abc@mail.com");
		Customers saved = dao.save(aCustomers);
		System.out.println("Saved Customers with id: "+saved.getId());
		System.out.println("Saved Customers with first name : "+saved.getFirstName());
		List<Customers> all = dao.findAll();
		System.out.println("There are " +all.size()+" Customers");
		System.out.println("Removing newly added Customers...");
		dao.deleteById(saved.getId());
		List<Customers> allnow = dao.findAll();
		System.out.println("There are " +allnow.size()+" Customers");
		
	}

}
