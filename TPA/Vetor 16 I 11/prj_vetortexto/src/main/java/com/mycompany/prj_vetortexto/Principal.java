/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_vetortexto;

/**
 *
 * @author alexe
 */
public class Principal {
    //public static String vetorNome[] = {"Sao Paulo". "Rio de Janeiro"}
    public static String vetorNome[] = {"S" , "a", "o" , "" , "P" , "a" , "u" , "l" , "o"};
    
    public static Vetor vet = new Vetor();
    
    
    public static void main(String [] args)
    {
        System.out.println("Vetores");
        vet.exibirVetorPorLetra(vetorNome);
        System.out.println("");
        vet.exibirVetorPorLinha(vetorNome);
        System.out.println("");
    }
}
