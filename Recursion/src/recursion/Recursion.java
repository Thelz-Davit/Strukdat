/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion;

/**
 *
 * @author Davit
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        recursionMethod(3);
    }

    static void recursionMethod(int n) {
        if (n < 1) {
            System.out.println("n nilai lebih kecil dari 1");
        } else {
            recursionMethod(n-1);
            System.out.println(n);
        }
    }
}
