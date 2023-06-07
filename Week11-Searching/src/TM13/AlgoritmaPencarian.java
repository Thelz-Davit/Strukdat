/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TM13;

import week11.searching.*;

/**
 *
 * @author Davit
 */
public class AlgoritmaPencarian {
    public static int linearSearch(Mahasiswa[] arrMhs, String nrp){
        for (int i = 0; i < arrMhs.length; i++) {
            if (arrMhs[i].getNrp() == nrp) {
                System.out.println("Elemen "+nrp+ " ditemukan pada index: "+i);
                return i;
            }
        }
        System.out.println("Element "+nrp+" tidak ditemukan");
        return -1;
    }
    
    public static int binarySearch(int arr[], int value){
        int low = 0;
        int high = arr.length-1;
        int mid = (low +high)/2;
        while(arr[mid] != value && low <= high){
            if (value < arr[mid]) {
                high = mid-1;
            } else {
                low = mid +1;
            }
            mid = (low +mid )/2;
        }
        if (arr[mid] == value) {
            System.out.println("ditemukan");
            return mid;
        } else {
            System.out.println("tidak ditemukan");
            return -1;
        }
    }
}
