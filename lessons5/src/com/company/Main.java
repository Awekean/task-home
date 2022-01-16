package com.company;

import com.company.base.vehiches.Car;
import com.company.base.professions.Driver;
import com.company.model.Ferrari;
import com.company.model.Maz;

public class Main {

    public static void main(String[] args) {

        Driver nick = new Driver("m","nick",10);
        Car maz = new Maz("maz","C",1666, nick, 10);


        Driver karl = new Driver("m","karl",5);
        Car ferrari = new Ferrari("Ferrari","B",1333,karl,316);

       




    }
}
