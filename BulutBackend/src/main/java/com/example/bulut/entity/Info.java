package com.example.bulut.entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "info")
public class Info {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private Integer tc;
    private Integer phone;

    private String email;

    private String adress;

    private Date birthDate;

    private String parakende;

    private String ek;

    private String semt;

    private String reason;

    private Integer quantity;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getParakende() {
        return parakende;
    }

    public void setParakende(String parakende) {
        this.parakende = parakende;
    }

    public String getEk() {
        return ek;
    }

    public void setEk(String ek) {
        this.ek = ek;
    }

    public String getSemt() {
        return semt;
    }

    public void setSemt(String semt) {
        this.semt = semt;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getTc() {
        return tc;
    }

    public void setTc(Integer tc) {
        this.tc = tc;
    }
}
