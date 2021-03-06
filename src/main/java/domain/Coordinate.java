package domain;

import java.math.BigDecimal;

public class Coordinate {
    private BigDecimal x;
    private BigDecimal y;

    public Coordinate(BigDecimal x, BigDecimal y) {
        setCoordinates(x, y);
    }

    public Coordinate() {
        this(new BigDecimal("0.00"), new BigDecimal("0.00"));
    }

    public double getY() {
        return y.doubleValue();
    }

    public void setY(BigDecimal y) {
        this.y = y;
    }

    public double getX() {
        return x.doubleValue();
    }

    public void setX(BigDecimal x) {
        this.x = x;
    }

    public void setCoordinates(BigDecimal x, BigDecimal y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
