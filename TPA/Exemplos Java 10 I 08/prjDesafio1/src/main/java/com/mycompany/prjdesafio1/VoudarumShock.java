/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjdesafio1;

import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class VoudarumShock {
    public static void main(String[] args) {
        
        int ano=0,futuro= 0, atual=0;
        
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de seu nascimento"));
        atual = 2022-ano;
        futuro = 2050-ano;
        
       JOptionPane.showMessageDialog(null,"Sua idade atual é: " +atual);
       JOptionPane.showMessageDialog(null,"Sua idade em 2050 sera de : " +futuro);
    }
    
}
