package com.viettel.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @jakarta.persistence.Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String department;
    private String phone;
    private String address;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
