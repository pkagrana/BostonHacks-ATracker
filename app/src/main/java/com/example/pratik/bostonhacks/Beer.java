package com.example.pratik.bostonhacks;

import java.text.DecimalFormat;

/**
 * Beer Class
 */
public class Beer extends Alcohol {

    private int amount;
    private static double constantMale = 0.68;
    private static double constantFemale = 0.5;
    private double BAC = 0;
    private double alcoholContent = 0;
    private double beerRatio = (7.0/6.0);
    private double timeConstant = (0.01 / 40);

    public Beer(int age, int weight, int amount, int time, boolean gender) {
        super(age, weight, time, gender);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public double getAlcoholContent() {

        alcoholContent = this.getAmount() * beerRatio;
        return alcoholContent;

    }

    public double getBAC() {

        DecimalFormat d = new DecimalFormat("0.000");

        if (this.getGender()) {

            BAC = 100 * ( (this.getAlcoholContent()) / ( this.getWeight() * (constantMale) ) );
        }
        else {
            BAC = 100 * ( (this.getAlcoholContent()) / ( this.getWeight() * (constantFemale) ) );
        }
        System.out.println(BAC - (this.getTime() * timeConstant));
        //System.out.println(Double.parseDouble(d.format(BAC - (this.getTime() * timeConstant))));
        return Double.parseDouble(d.format(BAC - (this.getTime() * timeConstant)));
    }
}
