package com.example.javademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.beans.factory.annotation.Value
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class JavademoApplication {


	@Value("${test.env}")
	private String env
	@Value("${test.db}")
	private String db

	@RequestMapping("/hello")
	@ResponseBody
	String demo(){
		return "env:" + env + " /hello, db:" + db
	}

	public static void main(String[] args) {
		SpringApplication.run(JavademoApplication.class, args);
	}

}
