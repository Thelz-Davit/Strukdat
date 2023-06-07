/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

/**
 *
 * @author Davit
 */
public class RecursionPangkat {
    public static void main(String[] args) {
        System.out.println(pangkat(5));
    }

    static int pangkat(int n) {
        if (n==0) {
            return 1;
        } else {
            var power = 2 * pangkat(n-1);
            return power;
        }
    }
}
