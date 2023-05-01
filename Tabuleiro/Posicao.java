package Tabuleiro;

public class Posicao {
    private int linha;
    private int coluna;

    /*Construtores*/
    public Posicao() {
    }
    public Posicao(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    /*Getters&Setter*/
    public void setLinhaEColuna(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }
    public int getLinha() {
        return linha;
    }
    public void setLinha(int linha) {
        this.linha = linha;
    }
    public int getColuna() {
        return coluna;
    }
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    /*Métodsos*/
    @Override
    public String toString() {
        return String.format("Linha: %d\nColuna: %d", linha, coluna);
    }
}
