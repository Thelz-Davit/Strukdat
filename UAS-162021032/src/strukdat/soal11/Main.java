/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strukdat.soal11;

/**
 *
 * @author Davit
 */
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        System.out.println("Anggota Himpunan");
        sLL.createSinglyLinkedList("Putri", 20);
        sLL.insertSinglyLinkedList("Toni", 16, 1);
        sLL.insertSinglyLinkedList("Agus", 19, 2);
        sLL.insertSinglyLinkedList("Ani", 18, 3);
        sLL.insertSinglyLinkedList("Lukas", 21, 4);
        sLL.insertSinglyLinkedList("Yuni", 16, 5);
        sLL.traversalSinglyLinkedList();
        System.out.println("");
        System.out.println("Ketua: "+sLL.max().Name+" dengan umur "+sLL.max().umur);
        System.out.println("Bendahara: "+sLL.min().Name+" dengan umur "+sLL.min().umur);
    }
}
