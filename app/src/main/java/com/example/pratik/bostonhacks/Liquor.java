package com.example.pratik.bostonhacks;

import java.text.DecimalFormat;

/**
 * Liquor Class
 */
public class Liquor extends Alcohol{

    private int amount;
    private static double constantMale = 0.68;
    private static double constantFemale = 0.5;
    private double BAC = 0;
    private double alcoholContent = 0;
    private double liquorRatio = (1.0/14.0);
    private double timeConstant = (0.01 / 40);

    public Liquor(int age, int weight, int time, int amount,boolean gender) {
        super(age, weight,time, gender);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public double getAlcoholContent() {

        alcoholContent = this.getAmount() * liquorRatio;
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

        return Double.parseDouble(d.format(BAC - (this.getTime() * timeConstant)));
    }
}
