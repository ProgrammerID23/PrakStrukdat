/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author FALL-NOU
 */
public class Latihan {
    String nama, kelas, MatkulPraktikum;
    int nim;

    public Latihan(String nama, String kelas, String MatkulPraktikum, int nim) {
        this.nama = nama;
        this.kelas = kelas;
        this.MatkulPraktikum = MatkulPraktikum;
        this.nim = nim;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Latihan> mhs = new HashMap();
        String input;
        Latihan data;
        
        mhs.put("1", new Latihan("Putri", "3H", "StrukturData", 2021103703));
        mhs.put("2", new Latihan("Agus", "4H", "Matematika", 2021103704));
        mhs.put("3", new Latihan("Blok", "3H", "AIK", 2021103705));
        
        System.out.print("Masukan ID: ");
        input = s.nextLine();
        data= mhs.get(input);
        if(data != null){
            System.out.println("Nama Mahasiswa: "+data.nama+", Kelas: "+data.kelas+", Matkul: "+data.MatkulPraktikum+", "
                    + "NIM: "+data.nim);
        }
    }
    
}
