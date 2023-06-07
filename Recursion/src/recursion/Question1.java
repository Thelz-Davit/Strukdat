/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

/**
 *
 * @author Davit
 * menghitung digit atas pangkat
 */
public class Question1 {
    public static void main(String[] args) {
        Question1 quest = new Question1();
        var hasil = quest.hitungJumlahDigit(521);
        System.out.println(hasil);
    }
    
    public int hitungJumlahDigit(int n){
        if (n==0 || n <0) {
            return 0;
        }
        return n%10 + hitungJumlahDigit(n/10);
    }
}
