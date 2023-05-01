package Xadrez;

import Enums.Cor;
import Tabuleiro.*;
import Xadrez.Pecas.*;

public class Partida {
    private Tabuleiro tabuleiro;
    private int Turno;
    private Cor jogadorAtual;
    private boolean check;
    private boolean checkmate;
    private PecaDeXadrez vulneravelEnPassant;
    private PecaDeXadrez promovido;


    /*Construtores*/
    public Partida() {
        tabuleiro = new Tabuleiro(8, 8);
        iniciarPartida();
    }

    /*Getters*/
    public PecaDeXadrez[][] getPecas() {
        PecaDeXadrez[][] matrizPecasXadrez = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int linhas = 0; linhas < tabuleiro.getLinhas(); linhas++) {
            for (int colunas = 0; colunas < tabuleiro.getColunas(); colunas++) {
                matrizPecasXadrez[linhas][colunas] = (PecaDeXadrez) tabuleiro.peca(linhas, colunas);
            }
        }
        return matrizPecasXadrez;
    }

    /*Métodos*/
    private void iniciarPartida() {
    }
}
