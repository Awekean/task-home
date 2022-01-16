package com.company.model;

import com.company.base.professions.Driver;
import com.company.base.vehiches.Sportcar;

public class Ferrari extends Sportcar {

    public Ferrari(String brandCar, String classCar, int weightCar, Driver driver, int maxSpeed) {
        super(brandCar, classCar, weightCar, driver,maxSpeed);
    }


    @Override
    public String toSpring() {

    }
}
