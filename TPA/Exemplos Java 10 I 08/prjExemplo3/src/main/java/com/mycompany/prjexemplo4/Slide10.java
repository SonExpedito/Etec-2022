/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjexemplo4;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Slide10 {
    
   public static void main(String[] args) {
   
   String str = "Isto é uma String de Java";
   String xyz = new String ("Isto é uma string do Java");
   //maneira errada de comparar string,portanto dará diferente
   if(str==xyz)
    System.out.println("Igual");
   else
    System.out.println("Diferente");
   //maneira correta de comparar string
   if (str.equals(xyz))
     System.out.println("Tamanho: "+ str.length());
     System.out.println("Substring: "+ str.substring(0,10));
     System.out.println("Caracter na posição 5: "+ str.charAt(5));
     //outros metódos
     //Quebra Sempre que encontrar espaço
     String palavras[]= str.split("");
     System.out.println("palavras: "+ palavras[0]);
     System.out.println("palavras: "+ palavras[1]);
     System.out.println("palavras: "+ palavras[2]);
     //aponta index
     int i = str.indexOf("Uma");
     System.out.println("Indice:"+ i ); //o indice conta a partir do 0
     //compara o início e o fim da indíce
      boolean teste =(str.startsWith("Olá") || str.endsWith("Mundo"));
      System.out.println("Resultado: "+ teste);
      //elimina espaços vazios no início e fim da string
      str=str.trim();
      System.out.println(str);
      //substitui caracteres
      str=str.replace('a','@');
      System.out.println(str);
      //substitui palavras
      str=str.replaceAll("string","Cadeia de Caracteres");
      System.out.println(str);
     
     
     
     
   }
           
    
}
