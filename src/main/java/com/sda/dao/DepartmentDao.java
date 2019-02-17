package com.sda.dao;

import com.sda.model.Department;
import com.sda.model.User;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class DepartmentDao extends GenericDao<Department> {

    public List<Department> findAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Department");
        List<Department> list = query.getResultList();
        transaction.commit();
        session.close();
        return list;
    }

}
