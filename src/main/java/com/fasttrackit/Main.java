package com.fasttrackit;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Cosmetice c1=new Cosmetice();
        c1.setNume(" Fond de ten lichid: Loreal");
        c1.setPret(65);
        c1.setCuloare("Natural");
        c1.setGreutate(250);
        c1.setCantitate(1);
        c1.setDescriere( "Acum puteți avea tenul neted, luminos și fără cusur! " +
                "Fondul de ten lichid se aplică ușor, se contopește perfect în piele și creează un aspect complet natural.");

        Cosmetice c2=new Cosmetice();
        c2.setNume("Rimel Maybelline");
        c2.setPret(116.8);
        c2.setCuloare("Negru");
        c2.setGreutate(0.150);
        c2.setCantitate(4);
        c2.setDescriere("Volum Express Colossal, noul rimel de la Maybelline ofera genelor de 15X mai mult volum, instant! Rapid, usor si eficient!");

        Electrocasnice e1=new Electrocasnice();
        e1.setNume(" Mixer de bucatarie");
        e1.setPret(367.43);
        e1.setTip("Gama de bucatarie: Philips");
        e1.setGreutate(3.450);
        e1.setCantitate(1);
        e1.setDescriere(" Accesorii multiple cu fixare rapidă ,spiralizator pentru fructe și legume, pahar on-the-go etanș pentru smoothie-uri, recipient pentru supă,Motor puternic de 800W pentru rezultate omogene\n" +
                "Ușor de curățat și apărătoare care previne stropirea");
        e1.setInaltime(12);
        e1.setLatime(35);
        e1.setLungime(20);

        Electrocasnice e2=new Electrocasnice();
        e2.setNume("Televizor 4K");
        e2.setPret(2899);
        e2.setTip("Samsung");
        e2.setGreutate(2.450);
        e2.setCantitate(1);
        e2.setDescriere(" Vizualizează continut HDR cu o claritate mai bună si o expresie a culorii detaliată. Televizorul Samsung UHD îti oferă detalii mai clare în scenele luminoase si întunecate.");
        e2.setInaltime(90);
        e2.setLatime(127);
        e2.setLungime(127);

        Alimente a1=new Alimente();
        a1.setNume("Ciocolata cu alune Milka");
        a1.setPret(13.50);
        a1.setGrupaProduse("Dulciuri");
        a1.setCantitate(3);
        a1.setDescriere("  Produse delicioase cu lapte din Alpi, pentru toți iubitorii de ciocolată. 100g.");

        Alimente a2=new Alimente();
        a2.setNume("Napolitane Manner ");
        a2.setPret(79.94);
        a2.setGrupaProduse("Dulciuri");
        a2.setCantitate(2);
        a2.setDescriere(" Manner napolitane ciocolata si caramel 400 g.");
        System.out.println(a2.getGrupaProduse()+" "+a2.getNume()+a2.getCantitate()+"buc "+a2.getPret()+"Ron "+" " +a2.getDescriere());

        Date dat = new Date();
        dat.setDate(200);
        System.out.println("Data expirare"+ "  " +dat);
    }
}
