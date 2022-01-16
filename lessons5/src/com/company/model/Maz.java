package com.company.model;

import com.company.base.professions.Driver;
import com.company.base.vehiches.Lorry;

public class Maz extends Lorry {


    public Maz(String brandCar, String classCar, int weightCar, Driver driver, int carryingCapacity) {
        super(brandCar, classCar, weightCar, driver, carryingCapacity);
    }



    @Override
    public String toSpring() {
        System.out.println();

    }
}
