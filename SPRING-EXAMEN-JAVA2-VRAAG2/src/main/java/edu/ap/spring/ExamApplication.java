package edu.ap.spring;

import java.util.Arrays;

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
		
		int[] intArray = new int[] { 11, 12, 13, 20, 25, 30, 37, 41, 50, 62, 78 };
		int[] result = exam.getTimesTwo(intArray);
		int[] expected = { 12, 20, 30, 50, 62, 78 };
		if(Arrays.equals(result, expected)) {
			System.out.println("Correct!");
		}	
		
		int result2 = exam.countUppercaseCharacters("WiE hEEft ER examENstress?");
		if(result2 == 8) {
			System.out.println("Correct!");
		}
		
		int result3 = exam.countChar(this.makeNamesList(), "e");
		if(result3 == 6) {
			System.out.println("Correct!");
		}
	}
}