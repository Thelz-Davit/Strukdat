/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TM13Kelompok;

/**
 *
 * @author Davit
 */
public class Pesanan {
    private String id;
    private String namaPesanan;
    private String namaPelanggan;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamaPesanan() {
        return namaPesanan;
    }

    public void setNamaPesanan(String namaPesanan) {
        this.namaPesanan = namaPesanan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public Pesanan(String id, String namaPesanan, String namaPelanggan) {
        this.id = id;
        this.namaPesanan = namaPesanan;
        this.namaPelanggan = namaPelanggan;
    }  
}


