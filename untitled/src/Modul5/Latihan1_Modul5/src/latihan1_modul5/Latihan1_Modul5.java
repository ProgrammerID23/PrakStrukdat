/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan1_modul5;

/**
 *
 * @author FALL-NOU
 */
public class Latihan1_Modul5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree pohon = new BinaryTree();
        
        pohon.NewNode(25);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);
        
        System.out.println("\nIn Order: ");
        pohon.inOrder(pohon.root);
        System.out.println("\nPre Order: ");
        pohon.PreOrder(pohon.root);
        System.out.println("\nPost Order: ");
        pohon.PostOrder(pohon.root);
    }
    
}
