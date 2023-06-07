/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TM12;

/**
 *
 * @author Davit
 */
public class Main {
    public static void main(String[] args) {
        BinaryTreeArray binaryTree = new BinaryTreeArray(12);
        binaryTree.insert("Kelas Kuliah");
        binaryTree.insert("Reguler");
        binaryTree.insert("Karyawan");
        binaryTree.insert("Mesin");
        binaryTree.insert("Industri");
        binaryTree.insert("Geodesi");
        binaryTree.insert("Sipil");
        binaryTree.insert("S1-Mesin");
        binaryTree.insert("S2-Mesin");
        binaryTree.insert("S1-Industri");
        binaryTree.insert("S2-Industri");
        
        
        binaryTree.preOrder(1);
        System.out.println("(PreOrder)");
        binaryTree.inOrder(1);
        System.out.println("(InOrder)");
        binaryTree.postOrder(1);
        System.out.println("(PostOrder)");
        binaryTree.levelOrder();
        System.out.println("(LevelOrder)");
        
        binaryTree.insert("S1 Geodesi");
        binaryTree.postOrder(1);
        System.out.println("(PostOrder)");
        
        binaryTree.delete("Sipil");
        binaryTree.levelOrder();
        System.out.println("(LevelOrder)");
        
    }
}
