/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TM13;

import week11.searching.*;

/**
 *
 * @author Davit
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa arrMahasiswa[] = new Mahasiswa[5];
        arrMahasiswa[0] = new Mahasiswa("162021001","Putra",3.15);
        arrMahasiswa[1] = new Mahasiswa("162021007","Jack",3.00);
        arrMahasiswa[2] = new Mahasiswa("162021023","Dony",3.20);
        arrMahasiswa[3] = new Mahasiswa("162021003","Ryan",2.75);
        arrMahasiswa[4] = new Mahasiswa("162021005","Miky",3.90);
        AlgoritmaPencarian searching = new AlgoritmaPencarian();
        
        
        int find = searching.linearSearch(arrMahasiswa, "162021003");
        System.out.println("Info Lengkap");
        System.out.println(arrMahasiswa[find].getNrp());
        System.out.println(arrMahasiswa[find].getNama());
        System.out.println(arrMahasiswa[find].getIpk());
    }
    
}
