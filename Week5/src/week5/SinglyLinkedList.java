/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author Davit
 */
public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    
    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue; 
        head = node;
        tail = node;
        size = 1;
        
        return head;
    }
    
    public void insertSinglyLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }
    
    public void traversalSinglyLinkedList(){
        if(head == null){
            System.out.println("Singly Linked List does't exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size-1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }
    
    boolean searchNode(int nodeValue){
        if(head == null){
            System.out.println("Singly Linked List does't exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Node ditemukan pada lokasi: "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node tidak ditemukan");
        return false;
    }
    
    public void deletetionNode(int location){
        if (head == null) {
            System.out.println("Singly List doesnt extist");
        } else if (location == 0) {
            head = head.next;
            size--;
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size-1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
    
    public void deleteAllSinglelyLinkedList(){
        head = null;
        tail = null;
        System.out.println("Singly LinkedList Successfully deleted");
    }
    
    boolean searchNodebyLocation(int location){
        if(head == null){
            System.out.println("Singly Linked List does't exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (i == location) {
                    System.out.println("Node ditemukan pada lokasi: "+i+" dengan nilai "+tempNode.value);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node tidak ditemukan");
        return false;
    }
}
