package com.sda.model;

import javax.persistence.*;
import java.util.List;

@Entity

@Table(name="department")
public class Department{

    @Id
    @Column(name="department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
    @Column(name="department_name", length = 40)
    private String departmentName;
    @Column(name = "manager_name", length = 40)
    private String managerName;

    public Long getId() {
        return id;
    }
    public String getManagerName() {
        return managerName;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}


