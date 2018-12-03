/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladia05;
public class Calculadora {
    public float divisao(float x, float y){
        float tot=0;
        try{
             tot = x/y;
        }
        catch(ArithmeticException e){
            System.out.println("Erro! "+e.getMessage());
        }
        return tot;
    }
    public static void vetor(int valor){
        float vetor[] = new float [2];
        try{
            for(int i=0; i<vetor.length; i++){
                vetor[i] = i+1;
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
