package com.example.apitest2;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "ApiTable")
public class ApiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    String nickname;
    String pw;
    String pwc;
    String email;
    String name;
    String address1;
    String address2;
    String address3;
    String address4;
    String birthday;
    String gender;
    String phone;

    public void setId(Long id) {
        Id = id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setPwc(String pwc) {
        this.pwc = pwc;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getId() {
        return Id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPw() {
        return pw;
    }

    public String getPwc() {
        return pwc;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getAddress3() {
        return address3;
    }

    public String getAddress4() {
        return address4;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }
}