/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strukdat.soal5;

/**
 *
 * @author Davitra Eka Sanusi - 162021032
 * 4 April 2023
 * Program untuk menghitung penjumlahan dari setiap angka inputan menggunakan rekursif
 */
public class No5 {
    public static void main(String[] args) {
        System.out.println(Penjumlahan(5));
    }
    
    static int Penjumlahan(int angka){
        if (angka == 0) {
            return angka;
        }
        int jumlah = angka + Penjumlahan(angka-1);
        return jumlah;
    }
}
