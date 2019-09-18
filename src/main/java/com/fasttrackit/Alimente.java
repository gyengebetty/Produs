package com.fasttrackit;

import java.util.Date;

public class Alimente extends Produs{
    Date dataExpirare;
    String grupaProduse;

    public Alimente() {
    }
    public Alimente(String grupaProduse) {
        this.grupaProduse = grupaProduse;
    }
    public String getGrupaProduse() {
        return grupaProduse;
    }
    public void setGrupaProduse(String grupaProduse) {
        this.grupaProduse = grupaProduse;
    }
}
