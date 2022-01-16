package com.company.base.professions;

public class Driver extends Person{

    private   String nameDriver;
    private int experience;

    public Driver(String gender,String nameDriver, int experience) {
        super(gender);
        this.nameDriver = nameDriver;
        this.experience = experience;
    }
}
