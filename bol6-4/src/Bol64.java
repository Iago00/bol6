/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ipampillonvieitez
 */
public class Bol64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        String nome1 = p1.setNome();
        float peso1 = p1.setPeso();
        String nome2 = p2.setNome();
        float peso2 = p2.setPeso();
        float dpeso = peso1 - peso2;
        if (dpeso <0)
            dpeso = dpeso*-1;
        System.out.println(p1.getDatos(nome1, nome2, peso1, peso2));
        System.out.println("A diferencia de peso é "+dpeso+" Kg");
    }

    
    
}
