/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernanda
 */
import java.util.Scanner;
import java.util.Random;

public class Jogo {
   Scanner dado = new Scanner(System.in);
   Random numeroAleatorio = new Random();
   public int tabuleiro[] = new int[100];
   public Jogador jog1 = new Jogador();
   public Barco barco1 = new Barco();
   public void Inicializa(){
       
       System.out.println("Digite o nome do Jogador: ");
       jog1.nome = dado.next();
       System.out.println("Digite o nome do barco do jogador: ");
       barco1.nome = dado.next();
       int n = numeroAleatorio.nextInt(100);
       for(int i=0; i<3; i++){
           barco1.posicao[i] = n;
           n++;
       }
       
   } 
   public void Inicial (){
       
   }
   
}
