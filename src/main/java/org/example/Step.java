package org.example;

public class Step {
    private City fromCity;
    private City toCity;
    private double distance;

    public City getFromCity() {
        return fromCity;
    }

    public void setFromCity(final City fromCity) {
        this.fromCity = fromCity;
    }

    public City getToCity() {
        return toCity;
    }

    public void setToCity(final City toCity) {
        this.toCity = toCity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(final double distance) {
        this.distance = distance;
    }
}
