package com.tiket.model;

public class TiketEkonomi extends Tiket {

    public TiketEkonomi(String kodeTiket, String namaPenumpang, double harga, String kotaTujuan) {
        super(kodeTiket, namaPenumpang, harga, kotaTujuan);
    }

    @Override
    public double hitungHarga() {
        return harga; // tanpa tambahan
    }
}