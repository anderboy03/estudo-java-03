/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_udemy;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class aula1 {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digita primeiro numero");
        String valor2= JOptionPane.showInputDialog("Digita segundo numero");
        String valor3 = JOptionPane.showInputDialog("Digita terceiro numero");
        
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);     
        double numero3= Double.parseDouble(valor3);
        
        double soma = numero1 + numero2 + numero3;
        System.out.println("soma e " + soma);
        System.out.println("media e "+ soma/3);


    }
    
    
    
}
