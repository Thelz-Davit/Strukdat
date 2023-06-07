/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublylinkedlist;

/**
 *
 * @author Davit
 */
public class DoublyLinkedList {

    /**
     * @param args the command line arguments
     */
    Node head;
    Node tail;
    int size;
    
    public Node creatingDoublyLinkedList(int nodeValue){
        head = new Node();
        Node newNode = new Node();
        
        newNode.value = nodeValue;
        
        newNode.next = null;
        newNode.prev = null;
        
        head = newNode;
        tail = newNode;
        
        size = 1;
        return head;
    }
    
    public void insertDoubly(int nodevalue, int lokasi){
        Node nodeBaru = new Node();
        nodeBaru.value = nodevalue;
        if (head == null) {
            creatingDoublyLinkedList(nodevalue);
            return;
        } else if (lokasi == 0){
            nodeBaru.prev = null;
            nodeBaru.next = head;
            head.prev = nodeBaru;
            head = nodeBaru;
        } else if (lokasi >= size){
            nodeBaru.next = null;
            nodeBaru.prev = tail;
            tail.next = nodeBaru;
            tail = nodeBaru;
        } else {
            Node currentNode = head;
            int indeks = 0;
            while (indeks < lokasi-1) {                
                currentNode = currentNode.next;
                indeks++;
            }
            nodeBaru.prev = currentNode;
            nodeBaru.next = currentNode.next;
            currentNode.next = nodeBaru;
            nodeBaru.next.prev = nodeBaru;
        }
        size++;
    }
    
    public void traversalDouble(){
        if (head != null) {
            Node currentNode = head;
            for (int i = 0; i < size; i++) {
                System.out.println(currentNode.value);
                if (i != size-1) {
                    System.out.println("->");
                }
                currentNode = currentNode.next;
            }
        } else {
            System.out.println("Doesnt exits");
        }
        System.out.println("\n");
    }
    
    public void reverseTraversal(){
        if (head != null) {
            Node currentNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.println(currentNode.value);
                if (i != size-1) {
                    System.out.println("<-");
                }
                currentNode = currentNode.prev;
            }
        } else {
            System.out.println("Doesnt exits");
        }
        System.out.println("\n");
    }
    
    public boolean searchNode(int nilaiNode){
        if (head != null) {
            Node currentNode = head;
            for (int i = 0; i < size; i++) {
                if (currentNode.value == nilaiNode) {
                    System.out.println("ditemukan di "+i);
                    return true;
                }
                currentNode = currentNode.next;
            }
        } 
        System.out.println("Doesnt exits");
        return false;
    }
    
    public void deleteNode(int lokasi){
        if (head == null) {
            System.out.println("dosen exist");
            return;
        } else if(lokasi == 0){
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = null;
                size--;
            }
        } else if(lokasi >= size){
            Node currentNode = tail.prev;
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                currentNode.next = null;
                tail = currentNode;
                size--;
            }
        } else {
            Node curreNode = head;
            for (int i = 0; i < lokasi; i++) {
                curreNode = curreNode.next;
            }
            curreNode.next = curreNode.next.next;
            curreNode.next.prev = curreNode;
            size--;
        }
    }
    
    public void deleteAllNode(){
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev =null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("Deleted");
    }
}
