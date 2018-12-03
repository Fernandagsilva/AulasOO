
package aula5;
/**
 *
 * @author Fernanda
 */
public class Aula {
    private String nome;
    private String dia;   
    /** 
    * Construtor
    */
    public Aula(String nome, String dia){
        this.nome = nome;
        this.dia = dia;
    }
    /** 
    * @Return o dia
    */
    public String getDia(){
        return this.dia;
    }
    /** 
    * @Return o nome
    */
    public String getNome(){
        return this.nome;
    }
    /** 
    * Muda o dia
    */
    public void setDia(String dia){
        this.dia = dia;
    }
    /** 
    * Muda o nome
    */
    public void setNome(String nome){
        this.nome = nome;
    }
}
