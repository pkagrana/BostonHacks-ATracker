package com.example.pratik.bostonhacks;

/**
 * Alchol Driver
 */
public class AlcoholDriver {

    public static void main(String[] args) {
        Beer b = new Beer(18, 160, 6, 0, true);

        System.out.println(b.getAlcoholContent());
        System.out.println(b.getBAC());
        System.out.println(b.getWeight());

    }

}
