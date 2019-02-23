package com.sda;

import com.sda.dao.DepartmentDao;
import com.sda.dao.EmployeeDao;
import com.sda.dao.UserDao;
import com.sda.model.Department;
import com.sda.model.Employee;
import com.sda.model.User;

public class Main {

    public static void main(String[] args) {
        User user = new User("admin", "admin");
        UserDao userDao = new UserDao();
        userDao.createEntity(user);

        Department department = new Department();
        department.setManagerName("ionut gogu");
        department.setDepartmentName("devOp");
        System.out.println(department.getManagerName());

        Department department2 = new Department();
        department2.setManagerName("Tiberiu Pupaza");
        department2.setDepartmentName("productie");
        System.out.println(department.getManagerName());

        DepartmentDao departmentDao = new DepartmentDao();
//          Department department = departmentDao.getEntityById(Department.class, 1L);
        departmentDao.createEntity(department);
        departmentDao.createEntity(department2);

        Employee employee = new Employee();
        employee.setName("bogdan babalau");
        employee.setDepartment(department);

        Employee employee2 = new Employee();
        employee2.setName("gigi musteata");
        employee2.setDepartment(department);

        Employee employee3 = new Employee();
        employee3.setName("dorel lopata");
        employee3.setDepartment(department2);

        EmployeeDao employeeDao = new EmployeeDao();
//          Employee employee = employeeDao.getEntityById(Employee.class, 1L);
        System.out.println(employee.getName());
        employeeDao.createEntity(employee);
        employeeDao.createEntity(employee2);
        employeeDao.createEntity(employee3);
    }
}
