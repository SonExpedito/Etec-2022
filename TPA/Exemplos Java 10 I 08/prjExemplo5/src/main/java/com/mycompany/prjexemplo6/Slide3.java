/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjexemplo6;

import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Slide3 {
    
    public static void main(String[] args) {
    
    int a = 0, b = 0, c = 0, d = 0, r=0;
    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1°Número"));
    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2°Número"));
    c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3°Número"));
    d = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4°Número"));
    r = (a*b) + (a*c) + (a*d);
    JOptionPane.showMessageDialog(null, "O resultado é: " + r);
    
    
    
    }
    
    
}
