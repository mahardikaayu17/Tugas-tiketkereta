package com.tiket.model;

public class TiketBisnis extends Tiket {

    public TiketBisnis(String idTiket, String namaPenumpang, double harga) {
        super(idTiket, namaPenumpang, harga);
    }

    @Override
    public double hitungHarga() {
        return getHarga() + 50000; // tambahan biaya bisnis
    }
}