package com.fasttrackit;

public class Cosmetice extends Produs {
    String culoare;
    double greutate;

    public Cosmetice() {
    }
    public Cosmetice(String culoare) {
        this.culoare = culoare;
    }
    public String getCuloare() {
        return culoare;
    }
    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    public double getGreutate() {
        return greutate;
    }
    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }
}
