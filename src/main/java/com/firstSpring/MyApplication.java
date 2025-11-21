package com.firstSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class MyApplication {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

    @RequestMapping("/login")
	String login() {
		return "redirect:/error-custom";

	}
    @GetMapping("/test")
    public String test() {
        throw new RuntimeException("Database not found!");
    }


    public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}