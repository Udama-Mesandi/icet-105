package edu.icet;

import edu.icet.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
        StudentController studentController = new StudentController();
        System.out.println(studentController.getStudentList());
    }
}