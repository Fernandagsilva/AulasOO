
package aula7;

/**
 *
 * @author Fernanda
 */
public class Jogador {
    private String nome;
    private int pontuacao=0;
    /**
    *Muda o nome 
    * @param nome
    */
    public void setNome(String nome){
        this.nome = nome;
    }
    /**
    *@return o nome 
    */
    public String getNome(){
        return nome;
    }
    /**
    *@return a pontuação 
    */
    public int getPontuacao(){
        return pontuacao;
    }
    
}
