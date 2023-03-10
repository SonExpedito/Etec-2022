/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_tratamento;

import java.util.Scanner;
import java.util.InputMismatchException;


/**
 *
 * @author dti
 */
public class  Prj_Tratamento
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
           try {
                  System.out.println("Informe a sua Idade: ");
                idade = teclado.nextInt();
           }
           catch(InputMismatchException ex1){
                  System.out.println("Ocorreu um erro na hora de armazenar a Idade, Devido ao tipo ser incompativél");
                  System.out.println("Desculpe, tente novamente! :(");
                  System.exit(0);
           }
            catch (NullPointerException e2)
            {
            
                   System.out.println("Não foi Possível armazenar a Idade, porque não foi informado nada (variável nula)" +e2.getMessage());
                   System.out.println("Desculpe, tente novamente! :(");
                   System.exit(0);
            }
        
        
         //*Altura
       
         try{
              System.out.println("Informe a sua altura (Utilize , para a separação de casas decimais): ");
              altura= teclado.nextFloat();
         }
         catch(InputMismatchException ex1){
                  System.out.println("Ocorreu um erro na hora de armazenar a Altura, Devido ao tipo ser incompativél");
                  System.out.println("Desculpe, tente novamente! :(");
                  System.exit(0);
           }
         catch (NullPointerException e2)
            {
            
                   System.out.println("Não foi Possível armazenar a Altura, porque não foi informado nada (variável nula)" +e2.getMessage());
                   System.out.println("Desculpe, tente novamente! :(");
                   System.exit(0);
            }
        
         
         
        //*Paulistano
        try{
        System.out.println("Você nasceu na Capital de São Paulo? (true para sim e false para não.)");
        paulistano= teclado.nextBoolean();
        }
        
        catch(InputMismatchException ex1){
                  System.out.println("Ocorreu um erro na hora de armazenar se você é Paulistano ou Não, Devido ao tipo ser incompativél /n Ou porque não foi respondido do jeito correto.");
                  System.out.println("Desculpe, tente novamente! :(");
                  System.exit(0);
           }
            catch (NullPointerException e2)
            {
            
                   System.out.println("Não foi Possível armazenar se você é Paulistano, porque não foi informado nada (variável nula)" +e2.getMessage());
                   System.out.println("Desculpe, tente novamente! :(");
                   System.exit(0);
            }
        
        //*Saída de Dados
        
        System.out.println("Cadastro Concluído com Sucesso. \n Os Dados que foram cadastrados em ordem:");
        System.out.println("O Nome Cadastrado: " +nome 
                +"\n A Idade Cadastrada: " +idade 
                +"\n A Altura Cadastrada: " +altura
                +"\n É Paulistano: " +paulistano        
        );                    
    }


}
