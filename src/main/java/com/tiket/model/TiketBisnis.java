package com.tiket.model;

public class TiketBisnis extends Tiket {

    public TiketBisnis(String kodeTiket, String namaPenumpang, double harga, String kotaTujuan) {
        super(kodeTiket, namaPenumpang, harga, kotaTujuan);
    }

    @Override
    public double hitungHarga() {
        return harga + (harga * 0.2); // contoh: ada tambahan 20%
    }
}