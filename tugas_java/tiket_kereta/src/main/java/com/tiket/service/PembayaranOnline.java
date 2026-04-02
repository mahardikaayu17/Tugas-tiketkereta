package com.tiket.service;

public class PembayaranOnline implements Pembayaran {

    private String metode;

    // Constructor
    public PembayaranOnline(String metode) {
        this.metode = metode;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran online via " + metode + " sebesar: " + jumlah);
    }
}