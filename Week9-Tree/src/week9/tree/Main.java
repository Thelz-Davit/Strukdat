/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week9.tree;

/**
 *
 * @author Davit
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeNode minuman = new TreeNode("Minuman");
        TreeNode panas = new TreeNode("Panas");
        TreeNode dingin = new TreeNode("Dingin");
        TreeNode teh = new TreeNode("Teh");
        TreeNode kopi = new TreeNode("Kopi");
        TreeNode sprite = new TreeNode("Sprite");
        TreeNode fanta = new TreeNode("Fanta");
        
        minuman.addChild(panas);
        minuman.addChild(dingin);
        panas.addChild(teh);
        panas.addChild(kopi);
        dingin.addChild(sprite);
        dingin.addChild(fanta);
        System.out.println(minuman.print(0));
    }
    
}
