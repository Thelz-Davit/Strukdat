/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

/**
 *
 * @author Davit
 */
public class DecimalToBiner {
    public static void main(String[] args) {
        DecimalToBiner dtb = new DecimalToBiner();
        var hasil = dtb.KonversiToBiner(35);
        System.out.println(hasil);
    }
    
    public int KonversiToBiner(int n){
        if (n==0) {
            
            return 0;
        }
        System.out.println(KonversiToBiner(n/2));
        return n%2 + 10*KonversiToBiner(n/2);
    }
}
