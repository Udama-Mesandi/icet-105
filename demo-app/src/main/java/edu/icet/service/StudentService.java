package edu.icet.service;

import edu.icet.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class StudentService {
    public ArrayList<Student> getStudent(){
        ArrayList<Student> studentArrayList= new ArrayList<Student>();
         studentArrayList.add(new Student("udama",20));
         studentArrayList.add(new Student("dinil",17));
        studentArrayList.add(new Student("yuwani",24));
         return studentArrayList;
    }




}
