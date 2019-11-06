/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol6.pkg3;

import java.util.Scanner;

/**
 *
 * @author ipampillonvieitez
 */
public class Bol63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    int numero;
        System.out.println("dime numero");
    numero=sc.nextInt();
    if (numero>0)
            System.out.println("+");
    else if(numero<0)
            System.out.println("-");
    else if(numero==0)
            System.out.println("0");
        
        
        
        
        
    }
    
}
