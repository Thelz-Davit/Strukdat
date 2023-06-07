/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

/**
 *
 * @author Davit
 */
public class Faktorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    static int fact(int n) {
        if (n < 0) {
            return -1;
        } if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n-1);
    }
}
