package bozofernanda;
import java.util.Scanner;

public class Dado {
    private int numFaces;
    private int[] faces;
    private int faceQueCaiu;

    public int rolar() {
        faceQueCaiu = (int) (Math.random() * 6 + 1);
        return faceQueCaiu;
    }
    public void jogar(Dado dados[]){
        Scanner leitura = new Scanner(System.in);
        for(int i=0; i<5; i++){
                dados[i].setFaceQueCaiu(rolar());
                System.out.println(dados[i].getFaceQueCaiu());
            }
        System.out.println("Deseja rolar novamente? [1] para sim [2] para não");
       if(leitura.nextInt() == 1){
          rolarNovamente(dados , 10);
      }
    }
    
    public void exibirFace(int face) {
        System.out.println(face);
    }
    public int getFaceQueCaiu(){
        return faceQueCaiu;
    }
    public void setFaceQueCaiu(int faceQueCaiu){
        this.faceQueCaiu = faceQueCaiu;
    }

    public void rolarNovamente( Dado dados[], int jogarNovamente){
        Scanner leitura = new Scanner(System.in);
        int rolarNovamente;
        while(jogarNovamente != 0){
           System.out.println("Deseja rolar novamente? [1] Para sim  [0] Para não");
           jogarNovamente = leitura.nextInt();
           if(jogarNovamente == 1){
           System.out.println("Qual dado você deseja rolar novamente? (1,2,3,4 ou 5)");
           rolarNovamente = leitura.nextInt();
           dados[rolarNovamente].setFaceQueCaiu(rolar());
           System.out.println(dados[rolarNovamente]);
           System.out.println("Deseja rolar novamente? [1] Para sim  [0] Para não");
           jogarNovamente = leitura.nextInt();
            if(jogarNovamente == 1){
                System.out.println("Qual dado você deseja rolar novamente? (1,2,3,4 ou 5)");
                rolarNovamente = leitura.nextInt();
                dados[rolarNovamente].setFaceQueCaiu(rolar());
                System.out.println(dados[rolarNovamente]);
                System.out.println("Deseja rolar novamente? [1] Para sim  [0] Para não");
                jogarNovamente = leitura.nextInt();
                     if(jogarNovamente == 1){
                     System.out.println("Qual dado você deseja rolar novamente? (1,2,3,4 ou 5)");
                     rolarNovamente = leitura.nextInt();
                     dados[rolarNovamente].setFaceQueCaiu(rolar());
                     System.out.println(dados[rolarNovamente]);
                     jogarNovamente = 0;
                     }
           }
        }
      } 
    }}
            


