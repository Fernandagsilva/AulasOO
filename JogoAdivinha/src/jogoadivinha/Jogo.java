/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoadivinha;

/**
 *
 * @author Fernanda
 */
public class Jogo {
    Jogador jog1;
    Jogador jog2;
    Jogador jog3;
    int nume;
    
    void Inicializar(){
        jog1 = new Jogador();
        jog1.nome = "Jog1";
        jog1.Jogar(10);
        jog2 = new Jogador();
        jog2.nome = "Jog2";
        jog2.Jogar(5);
        jog3 = new Jogador();
        jog3.nome = "Jog3";
        jog3.Jogar(2);
        
        
    }
    
}
