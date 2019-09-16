package com.example.student.listview;

public class Footballer {
    private String name;
    private String birthday;
    private int profile;

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getProfile() {
        return profile;
    }

    public Footballer(String name, String birthday, int profile) {
        this.name = name;
        this.birthday = birthday;
        this.profile = profile;
    }
}
