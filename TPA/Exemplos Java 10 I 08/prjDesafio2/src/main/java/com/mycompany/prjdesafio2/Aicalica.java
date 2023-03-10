/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjdesafio2;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Aicalica { 
    public static void main(String[] args) {
    
    int a=0 , b=0, r=0;
    
    a=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
    b=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));        
    
    r= (a*b)*(a*b);
    
    JOptionPane.showMessageDialog(null,"O Produto ao quadrado é igual a " +r);
    
    
    
    }
    
}
