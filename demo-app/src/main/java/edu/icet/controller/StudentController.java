package edu.icet.controller;

import edu.icet.model.Student;
import edu.icet.service.StudentService;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/ping")
    public String ping() {return "pong";}

    @GetMapping("/get-student-list")
   public ArrayList<Student> getStudentList(){
        return studentService.getStudent();
    }
}
