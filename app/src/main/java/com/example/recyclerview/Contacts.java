package com.example.recyclerview;

public class Contacts {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    private  String phone;
    private int imgId;


    public Contacts(String name, String phone, int imgId) {
        this.name = name;
        this.phone = phone;
        this.imgId = imgId;
    }

}
