package com.numandeniz.cruddemo.service;

import com.numandeniz.cruddemo.dao.EmployeeDAO;
import com.numandeniz.cruddemo.dao.EmployeeDAOJpalmpl;
import com.numandeniz.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO){
        employeeDAO=theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }



}
