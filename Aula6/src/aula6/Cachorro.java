/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;
import java.util.Scanner;

public class Cachorro {
    
    public String cor;
    public String nome;
    public String raça;
    public int idade;
    public String sexo;
    private int quantidade=0;
    public Cachorro(String nome, String raca){
        quantidade++;
        System.out.printf("Novo cachorro :)");
    }
    public void latir(){
        System.out.printf("Latindo!");
    }
}
