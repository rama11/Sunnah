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
public class Class extends Player {
    
    private String playerClass,name,pass;
    
    public Class (String inName, String inPass)
    {
        this.name = inName;
        this.pass = inPass;
    }
    
    public void setPlayerClass ()
    {
        System.out.println("Hi, " + name);
        System.out.println("Silakan Pilih Player Class yang ada di bawah ini : \n");
        
        System.out.println("  1 . Warrior Class");
        System.out.println("  2 . Weapon-Based Class");
        System.out.println("  3 . Healer Class");
        System.out.println("  4 . Mage Class");
        
        System.out.print("\nPilihan anda (angkanya) : ");
        Scanner inClass = new Scanner(System.in);
        
        switch(inClass.nextInt())
        {
            case 1:
                this.playerClass = "Warrior Class";
                break;
                
            case 2:
                this.playerClass = "Weapon-Based Class";
                break;
                
            case 3:
                this.playerClass = "Healer Class";
                break;
                
            case 4:
                this.playerClass = "Mage Class";
                break;
                
            default:
                break;
        }
    }
    
    public String getPlayerClass ()
    {
        return this.playerClass;
    }
    
    @Override
    public void showPlayer()
    {
        super.setFrist(name, pass);
        super.showPlayer();
        System.out.println("Classnya " + playerClass);
    }
}
