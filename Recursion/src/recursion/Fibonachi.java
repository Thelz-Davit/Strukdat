/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

/**
 *
 * @author Davit
 */
public class Fibonachi {
    public static void main(String[] args) {
        int maxNumber =5;
        System.out.println("Deret Fibo");
        for (int i = 0; i < maxNumber; i++) {
            System.out.println(fibonacci(i)+" ");
        }
    }
    
    static int fibonacci(int n){
        if (n<0) {
            return -1;
        }
        if(n ==0 || n ==1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
