package Xadrez.Pecas;

import Enums.Cor;
import Tabuleiro.Tabuleiro;
import Xadrez.PecaDeXadrez;

public class Rei extends PecaDeXadrez {


    /*Construtor*/
    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    /*Métodos*/
    @Override
    public String toString() {
        if (super.getCor() == Cor.BRANCO) {
            return "♔";
        } else {
            return "♚";
        }
    }
}
