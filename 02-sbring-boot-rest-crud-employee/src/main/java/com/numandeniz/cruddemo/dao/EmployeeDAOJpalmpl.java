package com.numandeniz.cruddemo.dao;

import com.numandeniz.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpalmpl implements EmployeeDAO {

    private EntityManager entityManager;


    @Autowired
    public  EmployeeDAOJpalmpl(EntityManager theEntityManagere){
        entityManager=theEntityManagere;
    }
    @Override
    public List<Employee> findAll() {

        TypedQuery<Employee> theQuery=entityManager.createQuery("from  Employee",Employee.class);

        List<Employee> employees=theQuery.getResultList();

        return employees;
    }

}
