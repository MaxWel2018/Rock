package domain;

import enums.Color;

public class Gemstone extends Stone {
    private final Gemstone gemstone;


    public Gemstone(Color color, Integer price, Double weight, Gemstone gemstone) {
        super(color, price, weight, transparency);
        this.gemstone = gemstone;
    }
}
