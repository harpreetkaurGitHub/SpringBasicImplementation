package com.BasicSpringFramwork.Basics;

import com.BasicSpringFramwork.Basics.basic.BinarySearch;
import com.BasicSpringFramwork.Basics.database.DAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicsConnectionApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(BasicsApplication.class,args);

		DAO dao1 = applicationContext.getBean(DAO.class);
		DAO dao2 = applicationContext.getBean(DAO.class);

		System.out.println("DAO bean 1 :: "+ dao1 );
		System.out.println("DAO bean 2 :: "+ dao2 );

	}

}
