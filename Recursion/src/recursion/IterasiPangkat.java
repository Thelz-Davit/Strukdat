/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

/**
 *
 * @author Davit
 */
public class IterasiPangkat {
    public static void main(String[] args) {
        System.out.println(pangkat(5));
    }

    static int pangkat(int n) {
        var indeks = 0;
        var pangkat = 1;
        while (indeks < n) {
            pangkat = pangkat * 2;
            indeks = indeks + 1;
        }
        return pangkat;
    }
}
