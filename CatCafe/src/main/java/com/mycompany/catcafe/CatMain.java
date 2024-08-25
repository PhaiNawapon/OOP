/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catcafe;

/**
 *
 * @author User
 */
public class CatMain {
    public static void main (String [] args){
        Barista c1 = new Barista ("01","Mumu",11,30000.0);
        c1.skill ("Make coffee","Make Tea");
        c1.BonusPlusSalary();
        
        Waiter c2 = new Waiter ("02","Milk",5,50000.0);
        c2.skill ("Love to talk with people");
        c2.BonusPlusSalary();
        
          
    }
    
}
