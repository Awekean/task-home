package com.company.base.vehiches;

import com.company.base.professions.Driver;

public abstract class Car {

    private String brandCar;
    private String classCar;
    private int weightCar;
    private Driver driver;

    public Car( String brandCar, String classCar, int weightCar, Driver driver) {

        this.brandCar = brandCar;
        this.classCar = classCar;
        this.weightCar = weightCar;
        this.driver = driver;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public  void stop() {
        System.out.println("Останавливаемся");
    }

    public  void turnRight(){
        System.out.println("Поворот направо");
    }

    public  void turnLeft(){
        System.out.println("Поворот налево");
    }

    public abstract String toSpring();
}
