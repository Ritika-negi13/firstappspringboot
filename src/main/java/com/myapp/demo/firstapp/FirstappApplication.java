package com.myapp.demo.firstapp;

import com.myapp.demo.firstapp.Entity.Student;
import com.myapp.demo.firstapp.dao.StudentDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//component scanning for explicit or custom packages outside main
//@SpringBootApplication(
//  scanBasePackages = { "com.myapp.demo.firstapp"}
//		// no need to add base package
// )
//explicity list base packages
public class FirstappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstappApplication.class, args);
	}

	// creating new command line runner
	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner -> {
			createStudent(studentDao);
		};
	}

	// saving data in database using jpa
	public void createStudent(StudentDao studentDao){
		Student student = new Student("Ritika" , "Negi" , "ritika.negi@gmail.com");
		studentDao.save(student);
		System.out.println("id : " + student.getId());
	}
}
