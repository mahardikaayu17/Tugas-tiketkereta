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
        Tiket tiket1 = new TiketEkonomi("T001", "Mahardika", 100000, "Bandung");
        Tiket tiket2 = new TiketBisnis("T002", "Ayu", 150000, "Jakarta");
        Tiket tiket3 = new TiketEkonomi("T003", "Widayanti", 120000, "Surabaya");

        double totalHarga = 0;

        // OUTPUT DATA TIKET
        System.out.println("===== DATA TIKET =====");

        System.out.println("Penumpang: " + tiket1.getNamaPenumpang());
        System.out.println("Tujuan: " + tiket1.getKotaTujuan());
        System.out.println("Harga: " + tiket1.hitungHarga());
        totalHarga += tiket1.hitungHarga();

        System.out.println();

        System.out.println("Penumpang: " + tiket2.getNamaPenumpang());
        System.out.println("Tujuan: " + tiket2.getKotaTujuan());
        System.out.println("Harga: " + tiket2.hitungHarga());
        totalHarga += tiket2.hitungHarga();

        System.out.println();

        System.out.println("Penumpang: " + tiket3.getNamaPenumpang());
        System.out.println("Tujuan: " + tiket3.getKotaTujuan());
        System.out.println("Harga: " + tiket3.hitungHarga());
        totalHarga += tiket3.hitungHarga();

        // TOTAL
        System.out.println("\nTotal Semua Tiket: " + totalHarga);

        // PEMBAYARAN CASH
        System.out.println("\n===== PEMBAYARAN CASH =====");
        Pembayaran bayarCash = new PembayaranCash();
        bayarCash.prosesPembayaran(tiket2.hitungHarga());

        // PEMBAYARAN ONLINE
        System.out.println("\n===== PEMBAYARAN ONLINE =====");
        Pembayaran bayarOnline1 = new PembayaranOnline("OVO");
        Pembayaran bayarOnline2 = new PembayaranOnline("DANA");
        Pembayaran bayarOnline3 = new PembayaranOnline("GOPAY");

        bayarOnline1.prosesPembayaran(tiket1.hitungHarga());
        bayarOnline2.prosesPembayaran(tiket2.hitungHarga());
        bayarOnline3.prosesPembayaran(tiket3.hitungHarga());

        // POLYMORPHISM
        System.out.println("\n===== POLYMORPHISM =====");
        Pembayaran pembayaran;

        pembayaran = new PembayaranCash();
        pembayaran.prosesPembayaran(50000);

        pembayaran = new PembayaranOnline("GOPAY");
        pembayaran.prosesPembayaran(75000);
    }
}