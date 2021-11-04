package com.tiemvacxin.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {


        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Integer id;

        private String name;

        private String email;

        private String Password;

        private String Sodienthoai;

        private String avt;

        private String Quyen;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getSoDienThoai() {
        return Sodienthoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        Sodienthoai = soDienThoai;
    }

    public String getAvt() {
        return avt;
    }

    public void setAvt(String avt) {
        this.avt = avt;
    }

    public String getQuyen() {
        return Quyen;
    }

    public void setQuyen(String quyen) {
        Quyen = quyen;
    }
}
