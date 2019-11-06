/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6.pkg2;

import java.util.Scanner;

/**
 *
 * @author ipampillonvieitez
 */
public class Bol62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        short numero1;
        short numero2;
        System.out.println("dime numero");
        numero1=sc.nextShort();
        System.out.println("dime numero");
        numero2=sc.nextShort();
        
        if(numero1>numero2)
              System.out.println("resta" +(numero1-numero2));
        else if(numero1<=numero2)
              System.out.println("suma" +(numero1+numero2));
                
                
                
    }
    
}
