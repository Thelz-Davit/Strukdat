/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author Davit
 */
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList("Tony Fergusson", 31);
        sLL.insertSinglyLinkedList("Charles Oliviera", 27, 1);
        sLL.insertSinglyLinkedList("Justin Gaethje", 22, 2);
        sLL.insertSinglyLinkedList("Dustin Poirier", 14, 3);
        sLL.insertSinglyLinkedList("Michael Chandler", 19, 4);
        sLL.insertSinglyLinkedList("Islam Makachev", 33, 5);
        sLL.traversalSinglyLinkedList();
        System.out.println("Champion: "+sLL.champ().fighterName+","+sLL.champ().wins);
        System.out.println("Loser: "+sLL.loser().fighterName+","+sLL.loser().wins);
    }
}
