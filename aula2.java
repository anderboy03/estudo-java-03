/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_udemy;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class aula2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Informe primeiro salario: ");
            String valor1=sc.next().replace(",",".");
            
            System.out.println("Informe segundo salario: ");
            String valor2=sc.next().replace(",",".");

            System.out.println("Informe terceiro salario: ");
            String valor3=sc.next().replace(",",".");
            
            double salario1 = Double.parseDouble(valor1);
            double salario2 = Double.parseDouble(valor2);
            double salario3 = Double.parseDouble(valor3);
            
            double media =(salario1+salario2+salario3)/3;
            
            System.out.println(" A media do salario e"+ media);


            
            
            
            sc.close();

        }
    
}
