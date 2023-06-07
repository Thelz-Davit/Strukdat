/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackArray;

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
        Stack stack = new Stack(4);
        stack.push(13);
        stack.push(5);
        stack.push(2);
        stack.push(10);
        System.out.println("Stack is empty? " + stack.isEmpty());
        stack.push(99);
        System.out.println("peek: " + stack.peek());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("peek: " + stack.peek());
        stack.push(2);
        System.out.println("peek: " + stack.peek());
        
        
    }
    
}
