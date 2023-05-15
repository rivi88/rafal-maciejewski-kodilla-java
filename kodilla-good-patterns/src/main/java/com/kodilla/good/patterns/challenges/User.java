package com.kodilla.good.patterns.challenges;

public class User {
    private String nickName;
    private String name;
    private String surname;

    public User(final String nickName, final String name, final String surname) {
        this.nickName = nickName;
        this.name = name;
        this.surname = surname;
    }

    public String getNickName() {
        return nickName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
