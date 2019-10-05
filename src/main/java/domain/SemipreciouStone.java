package domain;

import enums.Color;
import enums.SemipreciouStoneType;
import enums.Transparency;

public class SemipreciouStone extends Stone {
    private final SemipreciouStoneType type;


    public SemipreciouStone(Color color, Integer price, Double weight, Transparency transparency, SemipreciouStoneType type) {
        super(color, price, weight, transparency);
        this.type = type;
    }
}
