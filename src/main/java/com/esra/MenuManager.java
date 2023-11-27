package com.esra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MenuManager {

    private static List<Menu> haftalikMenuListesi = new ArrayList<>();

    public static void main(String[] args) {
        rastgeleMenu();
    }

    public static void rastgeleMenu(){
        List<Corba> corbalar= Arrays.asList(Corba.values());
        List<Icecek> icecekler= Arrays.asList(Icecek.values());
        List<Yemek> yemekler= Arrays.asList(Yemek.values());
        List<Tatli> tatlilar= Arrays.asList(Tatli.values());

        for (Gun gun: Gun.values()) {
            Corba rastgeleCorba = getRandomCorba(corbalar);
            Yemek rastgeleYemek = getRandomYemek(yemekler);
            Icecek rastgeleIcecek =getRandomIcecek(icecekler);
            Tatli rastgeleTatli = getRandomTatli(tatlilar);
            System.out.println("Menü: " + rastgeleCorba + " çorbası " + rastgeleYemek + " " + rastgeleTatli + " tatlısı " + rastgeleIcecek);

            Menu menu = new Menu(rastgeleCorba, rastgeleIcecek, rastgeleYemek, rastgeleTatli);
            haftalikMenuListesi.add(menu);

            System.out.println(gun + " Gunu Menu:");
        }
        }

    public static Corba getRandomCorba(List<Corba> corbalar){
        Random random = new Random();
        int indeks = random.nextInt(corbalar.size());
        return corbalar.get(indeks);
    }
    public static Icecek getRandomIcecek(List<Icecek> icecekler){
        Random random = new Random();
        int indeks = random.nextInt(icecekler.size());
        return icecekler.get(indeks);
    }
    public static Yemek getRandomYemek(List<Yemek> yemekler){
        Random random = new Random();
        int indeks = random.nextInt(yemekler.size());
        return yemekler.get(indeks);
    }
    public static Tatli getRandomTatli(List<Tatli> tatlilar){
        Random random = new Random();
        int indeks = random.nextInt(tatlilar.size());
        return tatlilar.get(indeks);
    }
    public List<Menu> getHaftalikMenuListesi() {
        return haftalikMenuListesi;
    }





}
