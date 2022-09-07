package com.example.apitest2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiDTO {
    private Long Id;
    private String nickname;
    private String pw;
    private String pwc;
    private String email;
    private String name;
    private String address1;
    private String address2;
    private String address3;
    private String address4;
    private String birthday;
    private String gender;
    private String phone;
}
