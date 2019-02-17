package com.sda.model;

import javax.persistence.*;

@Entity
@Table(name="department")
public class Department{
    @Id
    @Column(name="department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
}


