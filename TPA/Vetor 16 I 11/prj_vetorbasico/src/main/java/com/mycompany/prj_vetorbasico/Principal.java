/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_vetorbasico;

/**
 *
 * @author alexe
 */
public class Principal {
    public static int vetorNumeral[] = new int[5];
    public static Vetor vet = new Vetor();
    
    
    public static void main (String [] args)
    {
        System.out.println("Vetores...");
        
        vet.inicializarVetor(vetorNumeral);
        
        vet.exibirVetor(vetorNumeral);
     
    }
    
    
}
