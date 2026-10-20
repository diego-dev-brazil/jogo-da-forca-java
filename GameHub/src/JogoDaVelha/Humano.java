package JogoDaVelha;

import java.util.Scanner;

public class Humano extends Jogador {
    public Humano(char simbolo) {
        super(simbolo);
    }

    @Override
    public int[] escolherJogada(Tabuleiro tabuleiro, Scanner scanner) {
        int linha, coluna;
        while (true) {
            System.out.print("Jogador " + simbolo + " (linha coluna): ");
            linha = scanner.nextInt();
            coluna = scanner.nextInt();
            if (tabuleiro.jogadaValida(linha, coluna)) {
                return new int[]{linha, coluna};
            }
            System.out.println("Jogada invalida.");
        }
    }
}