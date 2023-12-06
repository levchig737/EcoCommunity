package com.example.ecocommunity.data;

public class User {
    public String firstName;
    public String LastName;
    public String patronymic;
    public String e_mail;
    public String password;
    public String age;
    public Boolean isAdmin;

    public User(String firstName, String LastName, String patronymic, String e_mail,
                String password, String age, Boolean isAdmin) {
        this.firstName = firstName;
        this.LastName = LastName;
        this.patronymic = patronymic;
        this.e_mail = e_mail;
        this.password = password;
        this.age = age;
        this.isAdmin = isAdmin;
    }
}
