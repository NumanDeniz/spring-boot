package com.numandeniz.cruddemo.dao;

import com.numandeniz.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
