package com.tiket.model;

public abstract class Tiket {
    protected String kodeTiket;
    protected String namaPenumpang;
    protected double harga;
    protected String kotaTujuan; 

    public Tiket(String kodeTiket, String namaPenumpang, double harga, String kotaTujuan) {
        this.kodeTiket = kodeTiket;
        this.namaPenumpang = namaPenumpang;
        this.harga = harga;
        this.kotaTujuan = kotaTujuan;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public abstract double hitungHarga();
}