/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queueimplementation;

/**
 *
 * @author Davit
 */
public class QueueArray {
    int[] intArray;
    int beginningOfQueue;
    int lastOfQueue;

    public QueueArray(int size) {
        this.intArray = new int[size];
        this.beginningOfQueue = -1;
        this.lastOfQueue = -1;
        System.out.println("Queue Created Successfully");
    }
    
    public boolean isFull(){
        if (lastOfQueue == intArray.length-1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isEmpty(){
        if ((beginningOfQueue == -1 || (beginningOfQueue == intArray.length))) {
            return true;
        } else {
            return false;
        }
    }
    
    public void enQueue(int value){
        if (isFull()) {
            System.out.println("Queue is Full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            lastOfQueue++;
            intArray[lastOfQueue] = value;
            System.out.println("Nilai "+value+"berhasi ditambahkan ke queue");
        } else {
            lastOfQueue++;
            intArray[lastOfQueue] = value;
            System.out.println("Nilai "+value+"berhasi ditambahkan ke queue");
        }
    }
    
    public int deQueue( ){
        if (isEmpty()) {
            System.out.println("Queue kosong");
            return -1;
        } else {
            int result = intArray[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > lastOfQueue) {
                beginningOfQueue = lastOfQueue = -1;
            }
            return result;
        }
    }
    
    public int peek(){
        if (isEmpty()) {
            return intArray[beginningOfQueue];
        } else {
            System.out.println("Query kosong");
            return -1;
        }
    }
    
    public void delete(){
        intArray = null;
        System.out.println("Queue Berhasil dihapus");
    }
}
