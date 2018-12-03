/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoadivinha;
import java.util.Scanner;
/**
 *
 * @author Fernanda
 */
public class Jogador {

    public Jogador() {
    }   
    public String nome;
    private int numb = (int)(Math.random()*10);
    public void Jogar(int x){
        if( numb == x){
            System.out.println("Acertou");
        }
        else{
         System.out.println("Você perdeu");
        }
    }
    
}
