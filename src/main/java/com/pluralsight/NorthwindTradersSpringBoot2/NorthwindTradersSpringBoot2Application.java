package com.pluralsight.NorthwindTradersSpringBoot2;

import com.pluralsight.NorthwindTradersSpringBoot2.services.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NorthwindTradersSpringBoot2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(NorthwindTradersSpringBoot2Application.class, args);

		ProductService productService = context.getBean(ProductService.class);
	}

}
