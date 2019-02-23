package com.sda.service;

import com.sda.dao.EmployeeDao;
import com.sda.model.Employee;
import com.sda.servlet.Employees;

import java.util.List;

public class EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDao();

    public Employee findById(Long id) {
        return employeeDao.getEntityById(Employee.class, id);
    }

    public List<Employees> findAll (){
        return employeeDao.findAll();
    }

    public void deleteEmployee(Employee employee){
        employee.setDeleted(true);
        employeeDao.updateEntity(employee);
    }

}


