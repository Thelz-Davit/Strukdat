/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author Davit
 */
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        sLL.insertSinglyLinkedList(6, 0);
        sLL.insertSinglyLinkedList(7, 1);
        sLL.traversalSinglyLinkedList();
        sLL.insertSinglyLinkedList(10, 0);
        sLL.traversalSinglyLinkedList();
        sLL.searchNode(5);
        sLL.deletetionNode(1);
        sLL.traversalSinglyLinkedList();
        sLL.deleteAllSinglelyLinkedList();
        sLL.traversalSinglyLinkedList();
    }
}
