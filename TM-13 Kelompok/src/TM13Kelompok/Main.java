/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TM13Kelompok;

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
        QueueLinkedList QLL = new QueueLinkedList();
        LinkedList LL = new LinkedList();
        Pesanan p1 = new Pesanan("P01", "Bakso", "Udin");
        Pesanan p2 = new Pesanan("P02", "Soto", "Kemon");
        Pesanan p3 = new Pesanan("P03", "Mie", "Lili");
        QLL.enQueue(p1);
        QLL.enQueue(p2);
        QLL.enQueue(p3);
        System.out.println("DAFTAR ANTRIAN: ");
        QLL.traversalQueue();
        System.out.println("Pesanan yang dihidangkan: "+QLL.peek().getId());
        QLL.deQueue();
        QLL.traversalQueue();
        System.out.println("Pesanan yang akan dibuat selanjutnya : "+QLL.peek().getId());
    }
    
}
