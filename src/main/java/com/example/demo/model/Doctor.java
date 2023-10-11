package com.example.demo.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "doctor")
public class Doctor implements Serializable {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "tel_num")
    private Long tel_num;

    public Doctor(Long id, String name, String surname, Long tel_num) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.tel_num = tel_num;
    }

    public Doctor() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getTel_num() {
        return tel_num;
    }

    public void setTel_num(Long tel_num) {
        this.tel_num = tel_num;
    }
}
