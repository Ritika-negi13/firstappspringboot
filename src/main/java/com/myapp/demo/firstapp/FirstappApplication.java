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
//			createStudent(studentDao);
			createMultipleStudent(studentDao);
//			readStudent(studentDao);
//			getAllStudent(studentDao);
//			queryForStudentByLastName(studentDao);
//			updateStudent(studentDao);
//			deleteStudent(studentDao);
//			deleteAllStudent(studentDao);
		};
	}

	public void getAllStudent(StudentDao studentDao){
		System.out.println(studentDao.findAll());
	}

	public void queryForStudentByLastName(StudentDao studentDao){
		System.out.println(studentDao.findByLastName());
	}

	public void createMultipleStudent(StudentDao studentDao){
		Student student1 = new Student("Shivam" , "Mandloi" , "ritika.negi@gmail.com");
		Student student2 = new Student("bb lemm" , "Negi" , "ritika.negi@gmail.com");
		studentDao.save(student1);
		studentDao.save(student2);
	}
	// saving data in database using jpa
	public void createStudent(StudentDao studentDao){
		Student student = new Student("Ritika" , "Negi" , "ritika.negi@gmail.com");
		studentDao.save(student);
		System.out.println("id : " + student.getId());
	}

	public void readStudent(StudentDao studentDao){
		System.out.println(studentDao.findById(4));
	}

	public void updateStudent(StudentDao studentDao){
		// find student with primaryid
		int studentId =1 ;
		Student student = studentDao.findById(1);

		// update name
		student.setFirstName("Ritu");
		// update data

		studentDao.update(student);
		//print

		System.out.println(student);
	}


	public void deleteStudent(StudentDao studentDao){
		int id =9;
		studentDao.delete(id);
		getAllStudent(studentDao);
	}


	public void deleteAllStudent(StudentDao studentDao){
		int x = studentDao.deleteAll();

		System.out.println("number of deleted student " + x);
	}
}
