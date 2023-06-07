/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TM13;

/**
 *
 * @author Davit
 */
public class Mahasiswa {
    
    private String nrp;
    private String nama;
    private double ipk;

    public Mahasiswa(String nrp, String nama, double ipk) {
        this.nrp = nrp;
        this.nama = nama;
        this.ipk = ipk;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    
}
