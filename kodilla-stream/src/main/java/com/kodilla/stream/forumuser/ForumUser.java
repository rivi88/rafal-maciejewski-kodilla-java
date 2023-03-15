package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private int userID;
    private String userName;
    private char gender;
    private LocalDate birthDate;
    private int numberOfPosts;

    public ForumUser(int userID, String userName, char gender, int yearOfBirth, int monthOfBirth, int dayOfBirth, int numberOfPosts) {
        this.userID = userID;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
