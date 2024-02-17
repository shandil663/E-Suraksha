package com.example.e_suraksha;

public class Modal {
    String mobile,location;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Modal() {
    }

    public Modal(String mobile, String location) {
        this.mobile = mobile;
        this.location = location;
    }


}
