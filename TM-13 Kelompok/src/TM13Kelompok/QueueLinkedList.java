/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TM13Kelompok;

/**
 *
 * @author Davit
 */
public class QueueLinkedList {
    LinkedList linkedList;

    public QueueLinkedList() {
        linkedList = new LinkedList();
        System.out.println("The Queue is successfully Created");
    }
    
    public boolean isEmpty(){
        if (linkedList.head == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void enQueue(Pesanan pesanan){
        linkedList.insertSinglyLinkedList(pesanan, linkedList.size);
        System.out.println("Successfully Inserted "+pesanan.getId()+" in the queue");
    }
    
    public Pesanan deQueue(){
        Pesanan pesanan = null;
        if (isEmpty()) {
            System.out.println("The Queue is empty");
        } else {
            pesanan = linkedList.head.pesanan;
            linkedList.deletetionNode(0);
        }
        
        return pesanan;
    }
    
    public Pesanan peek(){
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            return null;
        } else {
            return linkedList.head.pesanan;
        }
    }
    
    public void deleteQueue(){
        linkedList.head = null;
        linkedList.tail = null;
        System.out.println("The Queue is successfully Deleted");
    }
    
    public void traversalQueue(){
        linkedList.traversalSinglyLinkedList();
    }
}
