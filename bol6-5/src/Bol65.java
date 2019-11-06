/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author ipampillonvieitez
 */
public class Bol65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        System.out.println("Introduce o numero1");
        int num1 = sc.nextInt();
        System.out.println("Introduce o numero2");
        int num2 = sc.nextInt();
        System.out.println("Introduce o numero3");
        int num3 = sc.nextInt();
        Numeros obx1=new Numeros();
        obx1.comparar(num1, num2, num3);
        
    }
    
}
