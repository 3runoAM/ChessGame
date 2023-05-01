package Aplicacao;

import Xadrez.PecaDeXadrez;

public class InterfaceUsuario {
    public static void mostrarTabuleiro(PecaDeXadrez[][] pecas) {
        for (int linha = 0; linha < pecas.length; linha++) {
            System.out.print((8 - linha) + " ");
            for (int coluna = 0; coluna < pecas.length; coluna++) {
                mostrarPeca(pecas[linha][coluna]);
            }
            System.out.println();
        }
        System.out.println("  1 2 3 4 5 6 7 8");
    }

    public static void mostrarPeca(PecaDeXadrez peca) {
        if (peca == null) {
            System.out.print("-");
        } else {
            System.out.print(peca);
        }
        System.out.print(" ");
    }
}
