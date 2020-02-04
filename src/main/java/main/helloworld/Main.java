/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.helloworld;

import java.util.Scanner;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Dejan");
        
        int age=7;
        
        if (age>18){
          System.out.println("Osoba je punoletna");
        } else {
               System.out.println("Osoba je maloletna"); 
                  }
        System.out.print("---------------");
        System.out.print("Unesite broj godina: ");
        
        Scanner input= new Scanner(System.in);
        int userAge= input.nextInt();
        
         System.out.println("Korisnik je uneo:" + userAge);  
         if (age>18){
          System.out.println("Osoba je punoletna");
        } else {
               System.out.println("Osoba je maloletna"); 
                  }
          System.out.print("---------------");
          System.out.print("Unesite broj godina: ");
          input= new Scanner(System.in);
          int personAge=input.nextInt();
          
          if (personAge>0 && personAge<=5){
             System.out.println("Baby"); 
          }else if(personAge<=11){
              System.out.println("Kid");
          }else if(personAge<=17){
              System.out.println("Teen"); 
          }else if(personAge>=18){
          System.out.println("Adult");
        }
    }
    

}