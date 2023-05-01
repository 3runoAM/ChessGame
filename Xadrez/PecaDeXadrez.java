package Xadrez;

import Enums.Cor;
import Tabuleiro.*;

public class PecaDeXadrez extends Peca {
    private Cor cor;
    private int contadorDeMovimentos;

    /*Construtor*/
    public PecaDeXadrez(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }

    /*Getters*/
    public Cor getCor() {
        return cor;
    }

}
