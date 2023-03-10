/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_atividadecadastroaluno;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Util {
    
    Aluno aluno = new Aluno();
    
    
            public void digitarNome () {
            aluno.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno"));
            aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade do Aluno")));
            aluno.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite a Altura do Aluno")));
         //Falta o Boolean não sei como  faz esta porra
            
        }
            
            public void exibirNome () {
                JOptionPane.showMessageDialog(null, "O Nome do Aluno é " +aluno.getNome()  +"\n" 
                        +"A idade dele é: " +aluno.getIdade() +"\n" 
                        +" A Altura dele é: " +aluno.getAltura()   +"\n" 
                        +"É Paulistano: " 
                      
                );
               
            }
            
            
            }
    

              

             
             
              

