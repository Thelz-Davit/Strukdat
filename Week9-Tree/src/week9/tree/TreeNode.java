/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.tree;

import java.util.ArrayList;

/**
 *
 * @author Davit
 */
public class TreeNode {
    String data;
    ArrayList<TreeNode> children;
    
    public TreeNode(String data){
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }
    
    public void addChild(TreeNode node){
        this.children.add(node);
    }
    
    public String print(int level){
        String hierarki;
        hierarki = " ".repeat(level)+data+"\n";
        for (TreeNode node : this.children) {
            hierarki += node.print(level+1);
        }
        return hierarki;
    }
    
}

