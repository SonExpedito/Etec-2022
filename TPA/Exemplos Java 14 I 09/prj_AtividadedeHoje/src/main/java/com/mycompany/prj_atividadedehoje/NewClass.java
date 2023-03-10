/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_atividadedehoje;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class NewClass 
{
    public static Scanner teclado = new Scanner (System.in);
    public static String nome = "";
    public static int idade=0;
    public static boolean paulistano;
    public static float altura;
    
    
    
    
    public static void main(String args [])
    {
    System.out.println("Seja Bem Vindo a Aplicação de Cadastro \n Para começar, precisaremos que você coloque alguns dados.");
    
          //*Nome 
        System.out.println("Informe o Seu Nome: ");
        nome= teclado.nextLine();
        
          //*Idade
        System.out.println("Informe a sua Idade: ");
        idade = teclado.nextInt();
        
         //*Altura
        System.out.println("Informe a sua altura (Utilize , para a separação de casas decimais): ");
        altura= teclado.nextFloat();
        
        //*Paulistano
        System.out.println("Você nasceu na Capital de São Paulo? (true para sim e false para não.)");
        paulistano= teclado.nextBoolean();
        
        //*Saída de Dados
        
        System.out.println("Cadastro Concluído com Sucesso. \n Os Dados que foram cadastrados em ordem:");
        System.out.println("O Nome Cadastrado: " +nome 
                +"\n A Idade Cadastrada: " +idade 
                +"\n A Altura Cadastrada: " +altura
                +"\n É Paulistano: " +paulistano        
        );                    
    }
}
