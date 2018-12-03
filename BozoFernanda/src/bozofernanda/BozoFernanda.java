package bozofernanda;
import java.util.ArrayList;
import java.util.Scanner;
public class BozoFernanda {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numJogadores;
        System.out.println("Quantas pessoas vão Jogar ? [Max de 6 jogadores]");
        numJogadores = leitura.nextInt();
        Jogador[] jogadores = new Jogador[numJogadores];
        for(int i=0; i<numJogadores; i++){
           jogadores[i] = new Jogador(); 
        }
        for(int i=0; i<numJogadores; i++){
            System.out.printf("Digite as seguintes informações sobre o jogador %d \n" ,i);
            System.out.printf("Nome:  \n" );
            jogadores[i].setNome(leitura.next());
            System.out.printf("Tabuleiro: %d\n",i);
            jogadores[i].setTabuleiro(i);
        }       
        Dado[] dados = new Dado[5];
        for(int i=0; i<numJogadores; i++){
            jogadores[i].jogar(dados);
        }
    }
    
}
