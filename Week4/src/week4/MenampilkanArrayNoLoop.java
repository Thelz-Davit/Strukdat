/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Arrays;

/**
 *
 * @author Davit
 */
public class MenampilkanArrayNoLoop {
    public static void main(String[] args) {
        int[] arrBilangan;
        arrBilangan = new int[5];
        
        arrBilangan[0] = 5;
        arrBilangan[1] = 4;
        arrBilangan[2] = 3;
        arrBilangan[3] = 2;
        arrBilangan[4] = 1;
        
        System.out.println(Arrays.toString(arrBilangan));
        
        String[] arrBuah = {"Apel", "Jeruk","Mangga"};
        System.out.println(Arrays.toString(arrBuah));
    }
}
