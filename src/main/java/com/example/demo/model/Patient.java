package com.example.demo.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "patient")
public class Patient implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "tel_num")
    private int tel_num;

    @Column(name = "doctor_id")
    private int  doctor_id;

    @Column(name = "room_id")
    private int  room_id;

    public Patient(Long id, String name, int tel_num, int doctor_id, int room_id) {
        this.id = id;
        this.name = name;
        this.tel_num = tel_num;
        this.doctor_id = doctor_id;
        this.room_id = room_id;
    }

    public Patient() {

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

    public int getTel_num() {
        return tel_num;
    }

    public void setTel_num(int tel_num) {
        this.tel_num = tel_num;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }
}
