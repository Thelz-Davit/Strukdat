/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author Davit
 */
public class Tugas_162021032 {
    public static void main(String[] args) {
        int hari, counter=0, avg=0;
        int[] temp;
        
        System.out.print("Masukan Hari: ");
        Scanner input = new Scanner(System.in);
        hari = input.nextInt();
        temp = new int[hari];
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Temperature hari ke"+i);
            temp[i] = input.nextInt();
            avg += temp[i];
        }
        
        avg = avg/2;
        
        System.out.print("Rata - rata Suhu = "+avg);
        System.out.println();
        for (int i = 0; i < temp.length; i++) {
            if (avg < temp[i]) {
                counter++;
            }
        }
        System.out.print("jml hari yang diatas suhu = "+counter);
        System.out.println();
    }
}
