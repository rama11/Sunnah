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
        String nama, pass;
        
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan nama ");
        nama = masuk.next();
        System.out.print("Masukkan pass ");
        pass = masuk.next();
        System.out.println("Nama anda " + nama + "\n Dan password anda " + pass );
        
    }
}
