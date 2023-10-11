package com.example.demo.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="access")
public class Access implements Serializable {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "iC")
    @Id
    private Long IC;

    @Column(name = "password")
    private String password;

    @Column(name = "status")
    private String status;
    
    @Column(name = "cardLost")
    private String CardLost;


    public Access(Long IC, String password, String status, String cardLost, Long id) {
        this.IC = IC;
        this.password = password;
        this.status = status;
        CardLost = cardLost;

    }

    public Access() {

    }

    public Long getIC() {
        return IC;
    }

    public void setIC(Long IC) {
        this.IC = IC;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCardLost() {
        return CardLost;
    }

    public void setCardLost(String cardLost) {
        CardLost = cardLost;
    }

}


