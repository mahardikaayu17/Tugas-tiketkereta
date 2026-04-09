package com.tiket.model;

public class Kereta {
    private String kode;
    private String nama;
    private String tujuan;
    private double harga;
    private String jenis;

    public Kereta(String kode, String nama, String tujuan, double harga, String jenis) {
        this.kode = kode;
        this.nama = nama;
        this.tujuan = tujuan;
        this.harga = harga;
        this.jenis = jenis;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public String getTujuan() { return tujuan; }
    public double getHarga() { return harga; }
    public String getJenis() { return jenis; }
}