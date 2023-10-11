package com.example.demo.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "room")
public class Room implements Serializable {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @Id
    private Long id;

    @Column(name = "number")
    private int number;

    @Column(name = "class")
    private String class1;

    @Column(name = "floor")
    private int floor;

    public Room(Long id, int number, String class1, int floor) {
        this.id = id;
        this.number = number;
        this.class1 = class1;
        this.floor = floor;
    }

    public Room() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
