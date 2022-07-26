package com.wyx.pojo;

public class User {
    private String user_id;
    private String card_type;
    private String card_no;
    private String user_name;
    private String user_sex;
    private String user_age;
    private String user_role;

    public User() {
    }

    public User(String user_id, String card_type, String card_no, String user_name, String user_sex, String user_age, String user_role) {
        this.user_id = user_id;
        this.card_type = card_type;
        this.card_no = card_no;
        this.user_name = user_name;
        this.user_sex = user_sex;
        this.user_age = user_age;
        this.user_role = user_role;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_age() {
        return user_age;
    }

    public void setUser_age(String user_age) {
        this.user_age = user_age;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", card_type='" + card_type + '\'' +
                ", card_no='" + card_no + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_age='" + user_age + '\'' +
                ", user_role='" + user_role + '\'' +
                '}';
    }
}
