/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strukdat.soal9;

/**
 *
 * @author Davitra Eka Sanusi - 162021032
 * 4 April 2023
 * Program mencariNilaiDalam Array
 */
public class No9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        No9 no9 = new No9();
        int arr[] = {20,10,30,50,40,60};
        System.out.println("Nilai ditemukan pada indeks ke- "+no9.mencariNilaiDalamArray(arr, 40));
        
    }
    
    public int mencariNilaiDalamArray(int[] intArray, int nilaiYangDicari){
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == nilaiYangDicari) {
                return i;
            } 
        }
        return 0;
    }
    
}
