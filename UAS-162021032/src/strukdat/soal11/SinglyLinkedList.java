/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strukdat.soal11;

/**
 *
 * @author Davit
 */
public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    
    public Node createSinglyLinkedList(String nama,int umur){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.Name = nama;
        node.umur = umur; 
        head = node;
        tail = node;
        size = 1;
        
        return head;
    }
    
    public void insertSinglyLinkedList(String nama,int umur, int location){
        Node node = new Node();
        node.Name = nama;
        node.umur = umur;
        if (head == null) {
            createSinglyLinkedList(nama,umur);
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
                System.out.print(tempNode.Name +" "+ tempNode.umur);
                if (i != size-1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }
    
    boolean searchNode(int umur){
        if(head == null){
            System.out.println("Singly Linked List does't exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.umur == umur) {
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
                    System.out.println("Node ditemukan pada lokasi: "+i+" dengan nilai "+tempNode.umur);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node tidak ditemukan");
        return false;
    }
    
    public Node max(){
        Node jabatan = new Node();
        if(head == null){
            System.out.println("Singly Linked List does't exist");
        } else {
            Node tempNode = head;
            jabatan = tempNode;
            for (int i = 0; i < size; i++) {
                if (tempNode.umur > jabatan.umur) {
                    jabatan = tempNode;
                }
                tempNode = tempNode.next;
            }
        }
        return jabatan;
    }
    
    public Node min(){
        
        Node jabatan = new Node();
        if(head == null){
            System.out.println("Singly Linked List does't exist");
        } else {
            Node tempNode = head;
            jabatan = tempNode;
            for (int i = 0; i < size; i++) {
                if (tempNode.umur < jabatan.umur) {
                    jabatan = tempNode;
                }
                tempNode = tempNode.next;
            }
        }
        return jabatan;
    }
}
