package com.fasttrackit;

public class Electrocasnice extends Produs{
    String tip;
    double lungime;
    double latime;
    double inaltime;
    double greutate;

    public Electrocasnice() {
    }
    public Electrocasnice(String tip) {
        this.tip = tip;
    }
    public String getTip() {
        return tip;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }
    public double getLungime() {
        return lungime;
    }
    public void setLungime(double lungime) {
        this.lungime = lungime;
    }
    public double getLatime() {
        return latime;
    }
    public void setLatime(double latime) {
        this.latime = latime;
    }
    public double getInaltime() {
        return inaltime;
    }
    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }
    public double getGreutate() {
        return greutate;
    }
    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }
}
