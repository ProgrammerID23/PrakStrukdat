/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementasibinarytree;

import java.util.Scanner;

/**
 *
 * @author FALL-NOU
 */
public class ImplementasiBinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BinaryTree bt = new BinaryTree();
       Scanner s = new Scanner(System.in);
       
        System.out.println("Masukan jumlah elemen yang ingin ditambahkan: ");
        int n = s.nextInt();
        
        
        
        for(int i=1; i<=n; i++){
            System.out.print("Masukan elemen KE- "+i+":");
            String element = s.next();
            bt.NewNode(element);
        }
        
        System.out.println("Binary Search Tree (Inorder): ");
        bt.inOrder(bt.root);
        System.out.println();

        System.out.println("Binary Search Tree (Postorder): ");
        bt.PostOrder(bt.root);
        System.out.println();
        
        System.out.println("Binary Search Tree (Preorder): ");
        bt.PreOrder(bt.root);
        System.out.println();
        
        System.out.print("Masukkan elemen yang ingin dicari: ");
        String searchKey = s.next();

        Node result = bt.search(bt.root, searchKey);

        
        if (result != null){
            System.out.println(searchKey + " ditemukan dalam Binary Search Tree.");
        }
        else{
            System.out.println(searchKey + " tidak ditemukan dalam Binary Search Tree.");
        }

    }
    
}
