package Tabuleiro;

public class Peca {
    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    /*Constructor*/
    public Peca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }


    /*Getters&Setters*/
    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    /*Método*/
   /*/ public Peca[][] movimentosPossiveis(){

    };

    public boolean possivelMovimento(Posicao posicao){

    }

    public boolean haAlgumMovimentoPossivel(){

    }*/
}
