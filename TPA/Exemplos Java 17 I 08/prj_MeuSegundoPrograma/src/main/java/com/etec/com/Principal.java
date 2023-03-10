/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.com;

/**
 *
 * @author dti
 */
public class Principal {
    public static void main (String []args) 
    {
    //*Carrega na memória o objeto da classe Util
    Util comando = new Util();
    
    //*executa o metódo solicitado
    comando.digitarTexto();
    
    comando.exibirTexto();
    }
}
