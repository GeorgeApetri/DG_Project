package com.sda.dao;

import com.sda.model.Employee;
import com.sda.service.EmployeeService;
import com.sda.servlet.Employees;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeDao extends GenericDao<Employee>{

    public List<Employees> findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        //use the class name User instead of the table name
        Query query = session.createQuery("from Employee where isDeleted != true");

        List<Employees> list = query.getResultList();
        return list;
    }

}
