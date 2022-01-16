package com.company.base.vehiches;

import com.company.base.professions.Driver;

public abstract class Sportcar extends Car{

    private int maxSpeed;

    public Sportcar(String brandCar, String classCar, int weightCar,  Driver driver,int maxSpeed) {
        super(brandCar, classCar, weightCar, driver);
        this.maxSpeed=maxSpeed;
    }


}
