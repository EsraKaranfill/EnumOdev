package com.esra;

public class Menu {
    private Corba corba;
    private Icecek icecek;
    private Yemek yemek;
    private Tatli tatli;

    public Menu(Corba corba, Icecek icecek, Yemek yemek, Tatli tatli) {
        this.corba = corba;
        this.icecek = icecek;
        this.yemek = yemek;
        this.tatli = tatli;
    }

    @Override
    public String toString() {
        return String.format("Çorba: %s, İçecek: %s, Yemek: %s, Tatlı: %s", corba, icecek, yemek, tatli);
    }
}
