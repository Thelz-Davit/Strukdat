/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.tree.binarytree;

/**
 *
 * @author Davit
 */
public class Main {
    public static void main(String[] args) {
        BinaryTreeLinkedList binaryTree = new BinaryTreeLinkedList();
        
        BinaryNode n1 = new BinaryNode();
        n1.value = "N1";
        BinaryNode n2 = new BinaryNode();
        n2.value = "N2";
        BinaryNode n3 = new BinaryNode();
        n3.value = "N3";
        BinaryNode n4 = new BinaryNode();
        n4.value = "N4";
        BinaryNode n5 = new BinaryNode();
        n5.value = "N5";
        BinaryNode n6 = new BinaryNode();
        n6.value = "N6";
        BinaryNode n7 = new BinaryNode();
        n7.value = "N7";
        BinaryNode n8 = new BinaryNode();
        n8.value = "N8";
        BinaryNode n9 = new BinaryNode();
        n9.value = "N9";
        
        n1.leftChild = n2;
        n1.rightChild = n3;
        n2.leftChild = n4;
        n2.rightChild = n5;
        n3.leftChild = n6;
        n3.rightChild = n7;
        n4.leftChild = n8;
        n4.rightChild = n9;
        binaryTree.root = n1;
        
        System.out.println("preOrder: ");
        binaryTree.preOrderTraversal(binaryTree.root);
         System.out.println("\ninOrder: ");
        binaryTree.inOrder(binaryTree.root);
         System.out.println("\npostOrder: ");
        binaryTree.postOrder(binaryTree.root);
         System.out.println("\nlevelOrder: ");
        binaryTree.levelOrder();
        System.out.println("");
        binaryTree.search("N5");
        
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
        binaryTree.insert("N8");
        binaryTree.insert("N9");
        
        System.out.println("\nLevel Order: ");
        binaryTree.levelOrder();
        
        System.out.print("\nMenghapus DeepestNode: ");
        binaryTree.deleteDeepestNode();
        
        System.out.println("");
        binaryTree.levelOrder();
        System.out.println("");
        
        binaryTree.deleteNode("N3");
        binaryTree.levelOrder();
        
        System.out.println("");
        binaryTree.deleteBinaryTree();
    }
}
