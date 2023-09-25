package com.demo.app.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;


@Getter
@Setter
public class NewUserDto {


    private String firstName;
    private String lastName;
    @NotEmpty(message = "cant be null or empty")
    private String userName;
    @NotEmpty(message = "cant be null or empty")
    private String email;
    @NotEmpty(message = "cant be null or empty")
    private String passwd;
    @NotEmpty(message = "cant be null or empty")
    private  String confirmPasswd;
}
