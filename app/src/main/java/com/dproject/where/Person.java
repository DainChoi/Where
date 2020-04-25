package com.dproject.where;

public class Person {
    private Integer image;
    private String name;
    private String phone;

    public Person(Integer image, String name, String phone) {
        this.image = image;
        this.name = name;
        this.phone = phone;
    }


    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

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


}

