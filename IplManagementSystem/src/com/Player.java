package com;

public class Player {
    private String name;
    private Integer age;
    private int shirt_no;
    private String ipl_team;
    private String country;
    private String batting_Style;
    private String bowling_Style;
    private String role;

    public Player(String name, Integer age, int shirt_no, String ipl_team, String country, String batting_Style, String bowling_Style, String role) {
        this.name = name;
        this.age = age;
        this.shirt_no = shirt_no;
        this.ipl_team = ipl_team;
        this.country = country;
        this.batting_Style = batting_Style;
        this.bowling_Style = bowling_Style;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getShirt_no() {
        return shirt_no;
    }

    public void setShirt_no(int shirt_no) {
        this.shirt_no = shirt_no;
    }

    public String getIpl_team() {
        return ipl_team;
    }

    public void setIpl_team(String ipl_team) {
        this.ipl_team = ipl_team;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBatting_Style() {
        return batting_Style;
    }

    public void setBatting_Style(String batting_Style) {
        this.batting_Style = batting_Style;
    }

    public String getBowling_Style() {
        return bowling_Style;
    }

    public void setBowling_Style(String bowling_Style) {
        this.bowling_Style = bowling_Style;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", shirt_no=" + shirt_no +
                ", ipl_team='" + ipl_team + '\'' +
                ", country='" + country + '\'' +
                ", batting_Style='" + batting_Style + '\'' +
                ", bowling_Style='" + bowling_Style + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
