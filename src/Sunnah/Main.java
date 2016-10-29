/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sunnah;

import java.util.Scanner;

/**
 *
 * @author Rama
 */
public class Main {
    public static void main (String [] args)
    {
        // Deklarasi String untuk parameter membuat object player
        String nama, pass;
        
        Scanner inputParameter = new Scanner(System.in);
        System.out.print("Masukkan nama ");
        nama = inputParameter.nextLine();
        System.out.print("Masukkan pass ");
        pass = inputParameter.nextLine();
        
        // Membuat object baru bernama 
        Player user = new Player();
        user.setFrist(nama, pass);
        
        // Menampilkan object yang baru di buat
        user.showPlayer();
        
    }
}
