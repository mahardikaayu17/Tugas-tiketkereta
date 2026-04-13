package com.tiket.main;

import com.tiket.model.*;
import com.tiket.service.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            // INPUT NAMA
            System.out.print("Masukkan Nama Penumpang: ");
            String nama = input.nextLine();

            // DATA KERETA (MAP)
            Map<String, Kereta> daftarKereta = new HashMap<>();
            daftarKereta.put("K1", new Kereta("K1", "Argo", "Bandung", 100000, "Ekonomi"));
            daftarKereta.put("K2", new Kereta("K2", "Bima", "Jakarta", 150000, "Bisnis"));
            daftarKereta.put("K3", new Kereta("K3", "Sancaka", "Surabaya", 120000, "Ekonomi"));

            // TAMPILKAN DAFTAR KERETA
            System.out.println("\n===== DAFTAR KERETA =====");
            for (Kereta k : daftarKereta.values()) {
                System.out.println(k.getKode() + " | " + k.getNama()
                        + " | " + k.getJenis()
                        + " | " + k.getTujuan()
                        + " | Rp " + k.getHarga());
            }

            // PILIH KERETA
            System.out.print("Pilih kode kereta: ");
            String kode = input.nextLine().trim().toUpperCase();

            Kereta k = daftarKereta.get(kode);

            //  VALIDASI -> UBAH JADI THROW
            if (k == null) {
                throw new Exception("Kode kereta tidak ditemukan!");
            }

            // BUAT TIKET OTOMATIS
            Tiket tiket;

            if (k.getJenis().equalsIgnoreCase("Ekonomi")) {
                tiket = new TiketEkonomi("T001", nama, k.getHarga(), k.getTujuan());
            } else {
                tiket = new TiketBisnis("T002", nama, k.getHarga(), k.getTujuan());
            }

            double total = tiket.hitungHarga();

            // OUTPUT DATA
            System.out.println("\n===== DATA TIKET =====");
            System.out.println("Nama   : " + nama);
            System.out.println("Kereta : " + k.getNama());
            System.out.println("Tujuan : " + k.getTujuan());
            System.out.println("Jenis  : " + k.getJenis());
            System.out.println("Total  : Rp " + total);

            // PILIH PEMBAYARAN
            System.out.println("\n===== METODE PEMBAYARAN =====");
            System.out.println("1. Cash");
            System.out.println("2. Online");

            System.out.print("Pilih metode (1/2): ");
            String metode = input.nextLine();

            Pembayaran pembayaran;

            //  VALIDASI -> UBAH JADI THROW
            if (metode.equals("1")) {
                pembayaran = new PembayaranCash();
            } else if (metode.equals("2")) {
                System.out.print("Masukkan metode (OVO/DANA/GOPAY): ");
                String metodeOnline = input.nextLine();
                pembayaran = new PembayaranOnline(metodeOnline);
            } else {
                throw new Exception("Metode pembayaran tidak valid!");
            }

            // PROSES PEMBAYARAN
            pembayaran.prosesPembayaran(total);

        } catch (Exception e) {

            //  MENANGKAP ERROR
            System.out.println("\n[ERROR] " + e.getMessage());

        } finally {

            //  PASTI DIJALANKAN
            input.close();
            System.out.println("\nProgram selesai.");
        }
    }
}