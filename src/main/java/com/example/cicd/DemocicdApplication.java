package com.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemocicdApplication {
	
	@GetMapping("/welcome")
	public String welcome() {
		System.out.println("success");
		return "Welcome to GithubActions";
	}
	
//	echo "# Github-actions" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/sujanab9/Github-actions.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(DemocicdApplication.class, args);
	}

}
