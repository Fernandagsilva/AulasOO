/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;
import java.util.Scanner;

/**
 *
 * @author Fernanda
 */
public class Aula6 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int x=1,cachorro=0;
        while(x != 0){
           System.out.printf("Digite [1] caso deseja vender um cachorro e digite [2] caso deseja criar um cachorro e [0] caso deseje encerrar o programa: ");
           if(x==1){
               Venda venda = new Venda();
               venda.vender(doguinho);
           }
           if(x==2){
               Cachorro dog = new Cachorro();
               doguinho.latir();
               doguinho.cor = leitura.next();
               venda.vender(doguinho);
               
               cachorro++;
               
           }
        }
        
    }
    
}
