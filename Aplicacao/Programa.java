package Aplicacao;

import Xadrez.Partida;

public class Programa {
    public static void main(String[] args){
        Partida partidaVez = new Partida();
        InterfaceUsuario.mostrarTabuleiro(partidaVez.getPecas());
    }
}
