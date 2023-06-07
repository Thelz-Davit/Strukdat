/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author Davit
 */
public class Latihan {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        //1
        System.out.println("1. Insert 5 buah Node dengan data : 25 30 35 22 15");
        sLL.createSinglyLinkedList(25);
        sLL.insertSinglyLinkedList(30, 1);
        sLL.insertSinglyLinkedList(35, 2);
        sLL.insertSinglyLinkedList(22, 3);
        sLL.insertSinglyLinkedList(15, 4);
        sLL.traversalSinglyLinkedList();
        System.out.println();
        
        //2
        System.out.println("2. Lakukan Traversal padap Linked List tersebut");
        sLL.traversalSinglyLinkedList();
        System.out.println();
        
        //3
        System.out.println("3. Insert Node Pada lokasi ke-0 dengan data 20");
        sLL.insertSinglyLinkedList(20, 0);
        sLL.traversalSinglyLinkedList();
        System.out.println();
        
        //4
        System.out.println("4. Insert Node pada posisi tail dengan data 17");
        sLL.insertSinglyLinkedList(17, 6);
        sLL.traversalSinglyLinkedList();
        System.out.println();
        
        //5
        System.out.println("5. Cari node pada posisi ke-3");
        sLL.traversalSinglyLinkedList();
        sLL.searchNodebyLocation(3);
        System.out.println();
        
        //6
        System.out.println("6. Hapus node pada posisi ke-4");
        sLL.traversalSinglyLinkedList();
        sLL.deletetionNode(4);
        sLL.traversalSinglyLinkedList();
        System.out.println();
        
        //7
        System.out.println("7. Hapus seluruh node");
        sLL.deleteAllSinglelyLinkedList();
        sLL.traversalSinglyLinkedList();
        
    }
}
