package com.company.base.vehiches;

import com.company.base.professions.Driver;

public abstract class Lorry extends Car{

    private int carryingCapacity;


    public Lorry(String brandCar, String classCar, int weightCar, Driver driver,int carryingCapacity) {
        super(brandCar, classCar, weightCar, driver);
        this.carryingCapacity=carryingCapacity;
    }
}



