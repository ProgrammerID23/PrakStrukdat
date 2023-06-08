/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kegiatan1;

import java.util.Scanner;

/**
 *
 * @author FALL-NOU
 */
public class Kegiatan1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah string: ");
        String input = scanner.nextLine();

        Stack s = new Stack(input.length());
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            s.push(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            char c = s.pop();
            sb.append(c);
        }
        String output = sb.toString();

        System.out.println("Output: " + output);
    }
    

}
