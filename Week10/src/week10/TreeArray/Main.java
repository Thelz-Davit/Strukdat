/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week10.TreeArray;

/**
 *
 * @author Davit
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTreeArray binaryTree = new BinaryTreeArray(10);
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
        binaryTree.insert("N8");
        binaryTree.insert("N9");
        
        binaryTree.preOrder(1);
        System.out.println("PreOrder");
        binaryTree.inOrder(1);
        System.out.println("InOrder");
        binaryTree.postOrder(1);
        System.out.println("PostOrder");
        binaryTree.levelOrder();
        System.out.println("LevelOrder");
        binaryTree.search("N4");
        
        binaryTree.delete("N3");
        
        binaryTree.levelOrder();
        System.out.println("LevelOrder");
        binaryTree.deleteBinaryTree();
        
    }
    
}
