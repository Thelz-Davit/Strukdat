/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Davit
 */
public class ArrayDuaDimensi {
    int[][] arrBilangan = null;
    public ArrayDuaDimensi(int jumlahBaris, int jumlahKolom){
        arrBilangan = new int[jumlahBaris][jumlahBaris];
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                arrBilangan[i][j] = Integer.MIN_VALUE;
            }
        }
    }
    
    public void insert(int baris, int kolom, int nilaiYangditambahkan){
        try {
            if (arrBilangan[baris][kolom] == Integer.MIN_VALUE) {
                arrBilangan[baris][kolom] = nilaiYangditambahkan;
                System.out.println("Berhasil ditambhajkan");
            } else {
                System.out.println("Indeks sudah terisi");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indeks yang diakses tidak valid");
        }
    }
    public static void main(String[] args) {
        int[][] arrDuaDimensi;
        arrDuaDimensi = new int[3][3];

        arrDuaDimensi[0][0] = 5;
        arrDuaDimensi[0][1] = 7;
        arrDuaDimensi[0][2] = 5;
        arrDuaDimensi[1][0] = 4;
        arrDuaDimensi[1][1] = 1;
        arrDuaDimensi[1][2] = 1;
        arrDuaDimensi[2][0] = 2;
        arrDuaDimensi[2][1] = 2;
        arrDuaDimensi[2][2] = 1;
        
        System.out.println(Arrays.deepToString(arrDuaDimensi));
        
        String[][] arrStr = {{"a","b"},{"c","d"}};
        System.out.println(Arrays.deepToString(arrStr));
        
        
    }
    
    
}
