/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.catcafe;

/**
 *
 * @author User
 */
public class CatCafe {
       String id ;
       String name ;
       int age ;
       double salary;
       
public CatCafe (){
    System.out.println("I am work in CatCafe");
    displayCatInWork ();
    

} 

public CatCafe (String name,int age,double salary){
    
    this.name=name ;
    this.age=age ;
    this.salary=salary ;
    displayCatInWork ();

}
public CatCafe (String id,String name,int age,double salary){
    this.id=id ;
    this.name=name ;
    this.age=age ;
    this.salary=salary ;
    displayCatInWork ();

}
public void setID (String id){
    this.id=id;
}
public void setNAME (String name){
    this.name=name;
}
public void setAGE (int age){
    this.age=age;
}
public void setSALARY (double salary){
    this.salary=salary;
}

public void displayCatInWork (){
    System.out.println("ID = "+this.id);
    System.out.println("NAME = "+this.name);
    System.out.println("AGE = "+this.age);
    System.out.println("SALARY = "+this.salary);
    
}

public String getID (){
    return this.id ;
}

public String getNAMW (){
    return this.name ;
}

public int getAGE (){
    return this.age ;
}

public double getSALARY (){
    return this.salary ;
}

public void BonusPlusSalary (){
    System.out.println("Bonus = 10%");
    System.out.println("-----------");
}
        
    
}
