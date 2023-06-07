/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strukdat.soal10;

/**
 *
 * @author Davit
 */
public class No10 {
    public static void main(String[] args) {
        No10 no10 = new No10();
        int arr[] = {1,2,3,5,6,7,8,9,10};
        System.out.println("nilai yang hilang: "+no10.mencariNilaiYangHilang(arr));
    }
    
    public int mencariNilaiYangHilang(int[] intArray){
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] != (intArray[i+1]-1)) {
                return (intArray[i+1]-1);
            }
        }
        return 0;
    }
}
