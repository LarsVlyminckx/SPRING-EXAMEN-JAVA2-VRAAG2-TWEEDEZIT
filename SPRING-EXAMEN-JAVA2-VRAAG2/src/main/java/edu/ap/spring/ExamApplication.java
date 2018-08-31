package edu.ap.spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExamApplication {
	
	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return (args) -> {};
    }
	
	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
		
		Exam exam = new Exam();
		
		List<String> result3 = new ArrayList<String>();

		result3.add("Sandra");
		result3.add("Elke");
		result3.add("Katlien");
		result3.add("Kathleen");
		result3.add("Kirsten");
		
		
		int result4 = exam.countChar(result3, "e");
		System.out.println(result4);
		if(result4 == 6) {
			System.out.println("Correct!");
		}
	}
}