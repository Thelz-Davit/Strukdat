/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

/**
 *
 * @author Davit
 */
public class Question2 {
    public static void main(String[] args) {
        Question2 quest = new Question2();
        
        var hasil = quest.perpangkatan(2, 5);
        System.out.println(hasil);
    }
    
    public int perpangkatan(int angka, int pangkat){
        if (pangkat <0) {
            return -1;
        }
        if (pangkat == 0 || pangkat == 1) {
            return angka;
        }
        return angka * perpangkatan(angka, pangkat - 1);
    }
}
