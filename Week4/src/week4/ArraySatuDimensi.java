/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author Davit
 */
public class ArraySatuDimensi {
    int[] arrBilangan = null;
    
    public ArraySatuDimensi(int ukuranArray){
        arrBilangan = new int[ukuranArray];
        for (int i = 0; i < arrBilangan.length; i++) {
            arrBilangan[i] = Integer.MIN_VALUE;
        }
    }
    
    public void insert(int posisi, int nilaiYangDitambahkan){
        try {
            if (arrBilangan[posisi] == Integer.MIN_VALUE){
                arrBilangan[posisi] = nilaiYangDitambahkan;
                System.out.println("Berhasil Ditambahkan");
            } else {
                System.out.println("Indeks array yang sudah terisi");
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("Indeks tidak valid");
            
        }  
    }
    
    public void traversal(){
        try{
            for (int i = 0; i < arrBilangan.length; i++) {
                System.out.println(arrBilangan[i] + " ");
            }
        } catch(Exception e) {
            System.out.println("Array tidak tersedia");
        }
    }
    
    public void search(int nilaiYangDicari){
        for (int i = 0; i < arrBilangan.length; i++) {
            for (int j = 0; j < arrBilangan.length; j++) {
                if (nilaiYangDicari == arrBilangan[i]) {
                    System.out.println("Nilai ditemukan pada dindeks ke: "+i);
                    return;
                }
            }
        }
        System.out.println("Nilai tidak ditemukan");
    }
    
    public void delete(int indexYangDihapus){
        try {
            arrBilangan[indexYangDihapus] = Integer.MIN_VALUE;
            System.out.println("Nilai Berhasil Dihapus");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nilai yang akan dihapus tidak berada pada rentang array");
        }   
    }
    
    public static void main(String[] args) {
        ArraySatuDimensi insArray = new ArraySatuDimensi(10);
        
        insArray.insert(0, 0);
        insArray.insert(1, 10);
        insArray.insert(2, 20);
        insArray.insert(1, 30);
        insArray.insert(12, 120);
        
        // System.out.println(insArray.arrBilangan[13]); error
        
        insArray.traversal();
        insArray.search(10);
        insArray.delete(1);
        System.out.println(insArray.arrBilangan[1]);
    }
}
