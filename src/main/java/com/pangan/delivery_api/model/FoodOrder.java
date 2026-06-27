package com.pangan.delivery_api.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "food_delivery")
public class FoodOrder {
    
    @Id
    @Column(name = "id_pesanan", length = 50, nullable = false)
    private String idPesanan;

    @Column(name = "kategori_menu", length = 100)
    private String kategoriMenu;

    @Column(name = "harga_pesanan")
    private Integer hargaPesanan;

    @Column(name = "jarak_kirim_km")
    private Double jarakKirimKm;

    @Column(name = "waktu_tunggu_menit")
    private Integer waktuTungguMenit;

    @Column(name = "rating_pelanggan")
    private Double ratingPelanggan;

    @Column(name = "ulasan_teks", columnDefinition = "TEXT")
    private String ulasanTeks;

    @Column(name = "status_promo")
    private Boolean statusPromo;

    @Column(name = "tingkat_keluhan", length = 100)
    private String tingkatKeluhan;

    @Column(name = "status_pesanan", length = 100)
    private String statusPesanan;

    @Column(name = "tanggal_transaksi")
    private LocalDate tanggalTransaksi;

    public FoodOrder() {
    }

    // Getters and Setters
    public String getIdPesanan() { return idPesanan;}
    public void setIdPesanan(String idPesanan) { this.idPesanan = idPesanan; }

    public String getKategoriMenu() { return kategoriMenu; }
    public void setKategoriMenu(String kategoriMenu) { this.kategoriMenu = kategoriMenu; }

    public Integer getHargaPesanan() { return hargaPesanan; }
    public void setHargaPesanan(Integer hargaPesanan) { this.hargaPesanan = hargaPesanan; }

    public Double getJarakKirimKm() { return jarakKirimKm; }
    public void setJarakKirimKm(Double jarakKirimKm) { this.jarakKirimKm = jarakKirimKm; }

    public Integer getWaktuTungguMenit() { return waktuTungguMenit; }
    public void setWaktuTungguMenit(Integer waktuTungguMenit) { this.waktuTungguMenit = waktuTungguMenit; }

    public Double getRatingPelanggan() { return ratingPelanggan; }
    public void setRatingPelanggan(Double ratingPelanggan) { this.ratingPelanggan = ratingPelanggan; }

    public String getUlasanTeks() { return ulasanTeks; }
    public void setUlasanTeks(String ulasanTeks) { this.ulasanTeks = ulasanTeks; }

    public Boolean getStatusPromo() { return statusPromo; }
    public void setStatusPromo(Boolean statusPromo) { this.statusPromo = statusPromo; }

    public String getTingkatKeluhan() { return tingkatKeluhan; }
    public void setTingkatKeluhan(String tingkatKeluhan) { this.tingkatKeluhan = tingkatKeluhan; }

    public String getStatusPesanan() { return statusPesanan; }
    public void setStatusPesanan(String statusPesanan) { this.statusPesanan = statusPesanan; }

    public LocalDate getTanggalTransaksi() { return tanggalTransaksi; }
    public void setTanggalTransaksi(LocalDate tanggalTransaksi) { this.tanggalTransaksi = tanggalTransaksi; }

}
