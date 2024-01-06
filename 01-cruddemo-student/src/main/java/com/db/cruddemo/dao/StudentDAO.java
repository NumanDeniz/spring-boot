package com.db.cruddemo.dao;

import com.db.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO
{

    void save(Student student);
    Student findById(Integer id);

    List<Student> findAll();

    void update(Student theStudent);


    void delete(Integer id);
}
