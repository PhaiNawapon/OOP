/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catcafe;

/**
 *
 * @author User
 */
public class Waiter extends CatCafe {
    
    public void skill (){
        
    }
    
    public void skill (String...skill){
        for (int i = 0;i<skill.length;i++)
         System.out.println ("Skill = "+skill[i]);
            
    }

    public Waiter (String id,String name,int age,double salary){
        super(id,name,age,salary);
        System.out.println("I am Waiter!");
    }
    
    public void BonusPlusSalary (){
        System.out.println("Bonus = 30%");
    }
    
}
