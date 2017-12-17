package com.toby.scaffolding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Toby on 2017/12/17.
 */
@EnableTransactionManagement
@SpringBootApplication
public class ScaffoldingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScaffoldingApplication.class, args);
	}
}
