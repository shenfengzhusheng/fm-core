package org.xfs.test.study.se18;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo {
	
	public String test() {
		String key="old";
		new Thread(()->System.out.println("In Java8, Lambda expression rocks !!")).start();
		return key;
	}

	public void test2() {
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		features.forEach(n->System.out.println(n));
	}

	public static void main(String[] args) {

		new LambdaDemo().test2();
	}

}
