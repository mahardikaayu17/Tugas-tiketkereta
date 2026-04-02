package com.tiket.service;

public class PembayaranCash implements Pembayaran {

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran cash sebesar: " + jumlah);
    }
}