package Xadrez.Pecas;

import Enums.Cor;
import Tabuleiro.Tabuleiro;
import Xadrez.PecaDeXadrez;

public class Torre extends PecaDeXadrez {

    /*Construtor*/
    public Torre(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    /*Métodos*/

    @Override
    public String toString() {
        if (super.getCor() == Cor.BRANCO) {
            return "♖";
        } else {
            return "♜";
        }
    }
}
