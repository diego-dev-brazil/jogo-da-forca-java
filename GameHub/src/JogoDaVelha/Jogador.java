

package JogoDaVelha;


import java.util.Scanner;

public abstract class Jogador {
    protected char simbolo;

    public Jogador(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public abstract int[] escolherJogada(Tabuleiro tabuleiro, Scanner scanner);
}