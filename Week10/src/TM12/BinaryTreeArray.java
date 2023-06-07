/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TM12;

import week10.TreeArray.*;

/**
 *
 * @author Davit
 */
public class BinaryTreeArray {
    String[] arr;
    int lastUsedIndex;
    
    public BinaryTreeArray(int size){
        arr = new String[size+1];
        this.lastUsedIndex = 0;
        System.out.println("Blank Binary Tree dengan " + 
                "ukuran " + size + " dibuat");
    }
    
    //isFull
    boolean isFull(){
        if (arr.length-1 == lastUsedIndex) {
            return true;
        } else {
            return false;
        }
    }
    
    //insert method
    void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("Nilai " + value + " berhasil ditambahkan");
        } else {
            System.out.println("Binary Tree sudah penuh");
        }
    }
    
    //preOrder Traversal
    public void preOrder(int indexOfRootNode){
        if (indexOfRootNode > lastUsedIndex){
            return;
        }
        System.out.print(arr[indexOfRootNode]+ " ");
        preOrder(indexOfRootNode * 2);
        preOrder(indexOfRootNode * 2 + 1);
    }
    
    //inOrder Traversal
    public void inOrder(int index){
        if (index > lastUsedIndex){
            return;
        }
        inOrder(index * 2);
        System.out.print(arr[index] + " ");
        inOrder(index * 2 + 1);
    }
    
    //Post Order Traversal
    public void postOrder(int index){
        if (index > lastUsedIndex){
            return;
        }
        postOrder(2 * index);
        postOrder(2 * index + 1);
        System.out.print(arr[index] + " ");
    }
    
    //Level Order Traversal
    public void levelOrder(){
        for (int i = 1; i<=lastUsedIndex; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
    //Search method
    public int search(String value) {
        for (int i = 1; i <= lastUsedIndex; i++){
            if (arr[i] == value){
                System.out.println(value + " ada pada index ke : " + i);
                return i;
            }
        }
        System.out.println("Nilai tidak ada pada Binary Tree");
        return -1;
    }
    
    //Delete Method
    public void delete(String value) {
        int location = search(value);
        if (location == -1) {
            return;
        } else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("Node berhasil dihapus");
        }
    }
    
    //Delete BT
    public void deleteBinaryTree() {
        try {
            arr = null;
            System.out.println("Binary Tree berhasil dihapus");
            
        } catch (Exception e){
            System.out.println("Terjadi error saat penghapusan Tree");
        }
    }
}
