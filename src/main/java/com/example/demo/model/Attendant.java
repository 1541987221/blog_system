package com.example.demo.model;

public class Attendant {
    String idno,pwd,username;

    public Attendant(String idno, String pwd, String username) {
        this.idno = idno;
        this.pwd = pwd;
        this.username = username;
    }

    public Attendant() {
    }

    @Override
    public String toString() {
        return "Attendant{" +
                "idno='" + idno + '\'' +
                ", pwd='" + pwd + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
