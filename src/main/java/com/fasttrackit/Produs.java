package com.fasttrackit;

public class Produs  {
    double pret;
    String nume;
    String descriere;
    int cantitate;

    public Produs() {
    }
    public Produs(double pret) {
        this.pret = pret;
    }
    public double getPret() {
        return pret;
    }
    public void setPret(double pret) {
        this.pret = pret;
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getDescriere() {
        return descriere;
    }
    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }
    public int getCantitate() {
        return cantitate;
    }
    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
}
