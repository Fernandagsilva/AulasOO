/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
public class Jogador {
    
   public String nome;
   public int idade;
   public double numb;
   public void DigitaDados(){
       Scanner dados = new Scanner(System.in);
       System.out.printf("Informe os dados nome e idade:\n");
        nome = dados.next();
        idade = dados.nextInt();
        numb = Math.random()*10;
}
   public void EscolherNumero(){
       
   }
}