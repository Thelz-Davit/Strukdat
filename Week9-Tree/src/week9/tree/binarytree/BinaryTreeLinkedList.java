/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Davit
 */
public class BinaryTreeLinkedList {
    BinaryNode root;
    
    public BinaryTreeLinkedList(){
        this.root = null;
    }
    
    void preOrderTraversal(BinaryNode node){
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrderTraversal(node.leftChild);
        preOrderTraversal(node.rightChild);
    }
    
    void inOrder(BinaryNode node){
        if (node == null) {
            return;
        }
        inOrder(node.leftChild);
        System.out.print(node.value+ " ");
        inOrder(node.rightChild);
    }
    
    void postOrder(BinaryNode node){
        if (node == null) {
            return;
        }
        inOrder(node.leftChild);
        inOrder(node.rightChild);
        System.out.print(node.value+ " ");
    }
    
    void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {            
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value+ " ");
            if (presentNode.leftChild != null) {
                queue.add(presentNode.leftChild);
            }
            if (presentNode.rightChild != null) {
                queue.add(presentNode.rightChild);
            }
        }
    }
    
    public void search(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {            
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                System.out.println("Nilai "+value+" ditemukan!");
                return;
            } else {
                if (presentNode.leftChild != null) {
                    queue.add(presentNode.leftChild);
                }
                if (presentNode.rightChild != null) {
                    queue.add(presentNode.rightChild);
                }
            }
        }
        System.out.println("Nilai "+value+" tidak ditemukan");
    }
    
    void insert(String value){
        BinaryNode nodeBaru = new BinaryNode();
        nodeBaru.value = value;
        if (root == null) {
            root = nodeBaru;
            System.out.println("Node baru ditambahkan pada Root");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {            
            BinaryNode presentNode = queue.remove();
            if (presentNode.leftChild == null) {
                presentNode.leftChild = nodeBaru;
                System.out.println("Node berhasil ditambahkan");
                break;
            } else if (presentNode.rightChild == null) {
                presentNode.rightChild = nodeBaru;
                System.out.println("Node berhasil ditambahkan");
                break;
            } else {
                queue.add(presentNode.leftChild);
                queue.add(presentNode.rightChild);
            }
        }
    }
    
    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {            
            presentNode = queue.remove();
            if (presentNode.leftChild != null) {
                queue.add(presentNode.leftChild);
            }
            if (presentNode.rightChild != null) {
                queue.add(presentNode.rightChild);
            }
        }
        return presentNode;
    }
    
    public void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()) {            
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.leftChild == null) {
                previousNode.rightChild = null;
                return;
            } else if(presentNode.rightChild == null) {
                presentNode.leftChild = null;
                return;
            }
            queue.add(presentNode.leftChild);
            queue.add(presentNode.rightChild);
        }
    }
    
    void deleteNode(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {            
            BinaryNode presentNode = queue.remove();
            if (presentNode.value == value) {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("Node dihapus");
                return;
            } else {
                if (presentNode.leftChild != null) {
                    queue.add(presentNode.leftChild);
                }
                if (presentNode.rightChild != null) {
                    queue.add(presentNode.rightChild);
                }
            }
        }
        System.out.println("Node tidak ditemukan dalam Binary Tree");
    }
    
    void deleteBinaryTree(){
        root = null;
        System.out.println("Binary Tree berhasil dihapus");
    }
}
