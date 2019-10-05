package domain;

import enums.Color;
import enums.Transparency;

public abstract class Stone {
    private final Color color;
    private  final Integer price;
    private final Double weight;
    private final Transparency transparency;

    public Stone(Color color, Integer price, Double weight, Transparency transparency) {
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.transparency = transparency;
    }

    public Color getColor() {
        return color;
    }
    public Integer getPrice() {
        return price;
    }
    public Double getWeight() {
        return weight;
    }

}
