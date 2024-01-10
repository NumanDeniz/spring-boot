package com.numandeniz.demo.rest;

import com.numandeniz.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;
    @PostConstruct //verileri otomatik kendi yüklüyor
    public void loadData(){

        theStudents=new ArrayList<>();
        theStudents.add(new Student("Ahmet","Dag"));
        theStudents.add(new Student("Kerem","Kul"));
        theStudents.add(new Student("Dilek","Sahin"));



    }


    // Rest Pojo
    @GetMapping("/students")
    public List<Student> getStudents(){

        List<Student>theStudents=new ArrayList<>();
        theStudents.add(new Student("Ahmet","Dag"));
        theStudents.add(new Student("Kerem","Kul"));
        theStudents.add(new Student("Dilek","Sahin"));

        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){


        return theStudents.get(studentId);
    }

}












