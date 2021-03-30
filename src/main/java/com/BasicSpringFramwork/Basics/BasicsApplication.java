package com.BasicSpringFramwork.Basics;

import com.BasicSpringFramwork.Basics.basic.BinarySearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicsApplication {

	public static void main(String[] args) {

		// Basically sorting algo is our Bean and we are wiring into Dependency called binarySearch.
		// 1st way of creating beans and dependency.

//  		BinarySearch binarySearch = new BinarySearch(new BubbleSort()); // now i will change sorting algo here which i want to use !!
//			int result = binarySearch.binarySearch(new int[] {23,5,7,69,8},3);
//		 	System.out.println("Search element:: "+result);

// !!---------------------------------------------------------------------------------------------------------------------------------------!!

		// Now Insist of doing all the above things creating by own spring do things for us.
		// 2nd way of managing beans and dependencies.

		// Application context maintain all te beans
		ApplicationContext applicationContext = SpringApplication.run(BasicsApplication.class, args);
		BinarySearch binarySearch1 = applicationContext.getBean(BinarySearch.class);

		//2ns bean
		BinarySearch binarySearch2 = applicationContext.getBean(BinarySearch.class);

		System.out.println("Bean 1 :: "+binarySearch1);
		System.out.println("Bean 2 :: "+binarySearch2);

		int result = binarySearch1.binarySearch(new int[] {2,4,8,5,6,9},4);
		System.out.println("Search element:: "+result);
	}

}
