package com.rakuten.training;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rakuten.training.dal.ProductDAO;
import com.rakuten.training.domain.Product;

@SpringBootApplication
public class ProductAppApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer =
				SpringApplication.run(ProductAppApplication.class, args);
		//ProductConsoleUI ui = springContainer.getBean(ProductConsoleUI.class);
		//ui.createProductWithUI();
		
		
		
		//testFullProductDAO(springContainer);	
		
		
	}

	private static void testFullProductDAO(ApplicationContext springContainer) {
		ProductDAO dao = springContainer.getBean(ProductDAO.class);
		Product aProduct = new Product("test",12452,121);
		Product saved = dao.save(aProduct);
		System.out.println("Saved Product with id:"+saved.getId());
		List<Product> all = dao.findAll();
		System.out.println("there are " +all.size()+" products");
		System.out.println("Removing newly added product....");
		dao.deleteById(saved.getId());
		List<Product> allnow = dao.findAll();
		System.out.println("Now there are " +allnow.size()+" products");
	
	}

}
