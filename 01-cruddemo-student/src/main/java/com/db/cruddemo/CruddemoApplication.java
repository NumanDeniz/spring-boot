package com.db.cruddemo;

import com.db.cruddemo.dao.StudentDAO;
import com.db.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
			//createStudent(studentDAO);
			//createMultipleStudent(studentDAO);
			//reasStudent(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);


		};
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId=6;
		studentDAO.delete(studentId);
		System.out.println("Delete student:"+studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {

		//retrieve student.: primary key
		int studentId=1;
		Student myStudent=studentDAO.findById(studentId);

		//change first name
		myStudent.setLastname("Ak");


		//update the student
		studentDAO.update(myStudent);

		//display the updated
		System.out.println("Update student:"+ myStudent);

	}

	private void reasStudent(StudentDAO studentDAO) {
		//create student object
		Student tempStudent=new Student("Fatma","Avci","avcif@gmail.com");
		//save the student
		studentDAO.save(tempStudent);

		//display student
		int theId=tempStudent.getId();
		//retrieved student
		Student myStudent=studentDAO.findById(theId);


	}

	private void createMultipleStudent(StudentDAO studentDAO) {

		System.out.println(" Create 3 student object...");
		Student tempStudent1 = new Student("Ahmet","Aydin","ahmetaydin@gmail.com");
		Student tempStudent2 = new Student("Murat","Sahin","murats@gmail.com");
		Student tempStudent3 = new Student("Yilmaz","Deniz","yilmazd@gmail.com");

		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);



	}

	private void createStudent(StudentDAO studentDAO) {

		//create the student object
		System.out.println(" Create new student object...");
		Student tempStudent = new Student("Veli","Dag","velidag@gmail.com");

		//save teh student
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		//display id of the saved student
		System.out.println("Saved student. Generated id:"+tempStudent.getId());
	}
}
