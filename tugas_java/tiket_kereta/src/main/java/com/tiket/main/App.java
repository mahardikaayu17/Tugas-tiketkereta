package com.tiket.main;

import com.tiket.model.Tiket;
import com.tiket.model.TiketEkonomi;
import com.tiket.model.TiketBisnis;
import com.tiket.service.Pembayaran;
import com.tiket.service.PembayaranCash;
import com.tiket.service.PembayaranOnline;

public class App {
    public static void main(String[] args) {


        // DATA TIKET
        Tiket tiket1 = new TiketEkonomi("T001", "Mahardika", 100000);
        Tiket tiket2 = new TiketBisnis("T002", "Ayu", 150000);

        
        // OUTPUT DATA TIKET
        System.out.println("===== DATA TIKET =====");
        System.out.println("Penumpang: " + tiket1.getNamaPenumpang());
        System.out.println("Harga Tiket Ekonomi: " + tiket1.hitungHarga());

        System.out.println();

        System.out.println("Penumpang: " + tiket2.getNamaPenumpang());
        System.out.println("Harga Tiket Bisnis: " + tiket2.hitungHarga());


        // PEMBAYARAN CASH
        System.out.println("\n===== PEMBAYARAN CASH =====");
        Pembayaran bayarCash = new PembayaranCash();
        bayarCash.prosesPembayaran(tiket2.hitungHarga());


        // PEMBAYARAN ONLINE
        System.out.println("\n===== PEMBAYARAN ONLINE =====");
        Pembayaran bayarOnline1 = new PembayaranOnline("OVO");
        Pembayaran bayarOnline2 = new PembayaranOnline("DANA");

        bayarOnline1.prosesPembayaran(tiket1.hitungHarga());
        bayarOnline2.prosesPembayaran(tiket2.hitungHarga());

  
        // CONTOH POLYMORPHISM
        System.out.println("\n===== POLYMORPHISM =====");
        Pembayaran pembayaran;

        pembayaran = new PembayaranCash();
        pembayaran.prosesPembayaran(50000);

        pembayaran = new PembayaranOnline("GOPAY");
        pembayaran.prosesPembayaran(75000);
    }
}