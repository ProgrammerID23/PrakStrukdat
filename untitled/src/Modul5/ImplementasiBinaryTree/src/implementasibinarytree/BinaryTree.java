/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementasibinarytree;

/**
 *
 * @author FALL-NOU
 */

    class Node{
        String data;
        Node left;
        Node right;
        
        public Node(String data){
            this.data = data;
            left = right = null;
        }
    }
public class BinaryTree {

    public Node root;
    
    public void NewNode(String data){
        root = NewNode(root, new Node(data));
    }
    
    public Node NewNode(Node root, Node newData){
        if(root == null){
            root = newData;
            return root;
        }
        
        if(newData.data.compareTo(root.data) < 0){
            root.left = NewNode(root.left, newData);
        }else{
            root.right = NewNode(root.right, newData);
        }
        return root;
        
    }
    
    Node search(Node root, String newData){
        if(root==null || root.data.equals(newData)){
            return root;
        }
        
        if(newData.compareTo(root.data) < 0){
            return search(root.left, newData);
        }else{
            return search(root.right, newData);
        }
    }
    
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.data + " ");
            inOrder(node.right);
        }
    }
    
    public void PreOrder(Node node){
        if(node != null){
            System.out.println(node.data + " ");
            inOrder(node.left);
            inOrder(node.right);
        }
    }
    
    public void PostOrder(Node node){
        if(node != null){
            PostOrder(node.left);
            PostOrder(node.right);
            System.out.println(node.data+ " ");
        }
    }
}
