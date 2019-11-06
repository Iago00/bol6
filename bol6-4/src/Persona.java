
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ipampillonvieitez
 */
public class Persona {
      private String nome;
    private float peso;
    
    
    public Persona(){}
    
    public Persona(String nom, float pes){
    this.nome=nom;
    this.peso=pes;
    }
    
    Scanner sc = new Scanner(System.in);
    public String setNome(){
        System.out.println("Dime o seu nome:");
        String nom = sc.nextLine();
        return nom;
    }
    public float setPeso(){
        System.out.println("Dime o seu peso:");
        float pes = sc.nextFloat();
        return pes;
    }
    public String getDatos(String nome1, String nome2, float peso1, float peso2){
        if (peso1 > peso2)
            return("O nome do que pesa máis é "+nome1+" e pesa "+peso1+" Kg");
        else
            return("O nome do que pesa máis é "+nome2+" e pesa "+peso2+" Kg");
    }
}
