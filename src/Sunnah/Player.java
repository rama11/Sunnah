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
public class Player {
    private String name,pass, playerClass;
    
    public void setFrist(String inName,String inPass)
    {
        this.name = inName;
        this.pass = inPass;
    }
    
    public void showPlayer()
    {
        System.out.println("Nama player " + name);
        System.out.println("Passwordnya " + pass);
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getPass()
    {
        return this.pass;
    }
    
}
