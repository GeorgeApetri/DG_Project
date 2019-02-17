package com.sda.service;

import com.sda.dao.DepartmentDao;
import com.sda.model.Department;

public class DepartmentService {
    private DepartmentDao departmentDao = new DepartmentDao();

    public Department findById(Long id){
        return departmentDao.getEntityById(Department.class, id);
    }
}


