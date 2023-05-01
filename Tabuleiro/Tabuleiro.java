package Tabuleiro;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    /**/

    /*Construtor*/
    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    /*Setters&Getters*/

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    /*Métodos*/
    public Peca peca(int linha, int coluna){
        return pecas[linha][coluna];
    }
    public Peca peca(Posicao posicao){
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }
    public void colocarPeca(Peca peca, Posicao posicao){
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

    /*
    public boolean posicaoExistente(){}
    public boolean haUmaPeca(){}
    */
}
