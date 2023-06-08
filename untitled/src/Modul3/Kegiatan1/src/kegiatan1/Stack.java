/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kegiatan1;

/**
 *
 * @author FALL-NOU
 */
public class Stack {
        private char[] data;
        private int size;

        public Stack(int capacity) {
            data = new char[capacity];
            size = 0;
        }

        public void push(char c) {
            data[size] = c;
            size++;
        }

        public char pop() {
            size--;
            return data[size];
        }

        public boolean isEmpty() {
            return size == 0;
        }
}
