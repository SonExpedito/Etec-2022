/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_vetortexto;

/**
 *
 * @author alexe
 */
public class Vetor {
    
    void exibirVetorPorLetra (String[] _vetor)
    {
         for (int contador=0; contador < _vetor.length ; contador++)
         {
           System.out.println("Indice => " +contador + " / Letra =>" + _vetor[contador]);
         }
    }
    
    void exibirVetorPorLinha(String[] _vetor){
        System.out.print("Nome:");
        
        for (int contador=0; contador< _vetor.length ; contador++){
            System.out.println(_vetor[contador]);
        }
    }
}
