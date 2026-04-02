package com.tiket.model;

public class TiketEkonomi extends Tiket {

    public TiketEkonomi(String idTiket, String namaPenumpang, double harga) {
        super(idTiket, namaPenumpang, harga);
    }

    @Override
    public double hitungHarga() {
        return getHarga(); // tanpa tambahan
    }
}