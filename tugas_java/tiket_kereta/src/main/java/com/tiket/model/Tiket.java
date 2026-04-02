package com.tiket.model;

public abstract class Tiket {

    private String idTiket;
    private String namaPenumpang;
    private double harga;

    // Constructor
    public Tiket(String idTiket, String namaPenumpang, double harga) {
        this.idTiket = idTiket;
        this.namaPenumpang = namaPenumpang;
        this.harga = harga;
    }

    // Getter (Encapsulation)
    public String getIdTiket() {
        return idTiket;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public double getHarga() {
        return harga;
    }

    // Abstract method (Abstraction)
    public abstract double hitungHarga();
}