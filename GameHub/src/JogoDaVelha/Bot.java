package JogoDaVelha;

import java.util.Scanner;

public class Bot extends Jogador {
    private char oponente;

    public Bot(char simbolo) {
        super(simbolo);
        this.oponente = (simbolo == 'X') ? 'O' : 'X';
    }

    @Override
    public int[] escolherJogada(Tabuleiro tabuleiro, Scanner scanner) {
        System.out.println("Bot " + simbolo + " pensando...");
        int melhorValor = Integer.MIN_VALUE;
        int[] melhorJogada = new int[]{-1, -1};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro.jogadaValida(i, j)) {
                    tabuleiro.fazerJogada(i, j, simbolo);
                    int valorJogada = minimax(tabuleiro, 0, false);
                    tabuleiro.desfazerJogada(i, j);
                    if (valorJogada > melhorValor) {
                        melhorValor = valorJogada;
                        melhorJogada[0] = i;
                        melhorJogada[1] = j;
                    }
                }
            }
        }
        return melhorJogada;
    }

    private int minimax(Tabuleiro tabuleiro, int profundidade, boolean isMax) {
        int score = avaliar(tabuleiro);
        if (score == 10) return score - profundidade;
        if (score == -10) return score + profundidade;
        if (tabuleiro.estaCheio()) return 0;

        if (isMax) {
            int melhor = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tabuleiro.jogadaValida(i, j)) {
                        tabuleiro.fazerJogada(i, j, simbolo);
                        melhor = Math.max(melhor, minimax(tabuleiro, profundidade + 1, !isMax));
                        tabuleiro.desfazerJogada(i, j);
                    }
                }
            }
            return melhor;
        } else {
            int melhor = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tabuleiro.jogadaValida(i, j)) {
                        tabuleiro.fazerJogada(i, j, oponente);
                        melhor = Math.min(melhor, minimax(tabuleiro, profundidade + 1, !isMax));
                        tabuleiro.desfazerJogada(i, j);
                    }
                }
            }
            return melhor;
        }
    }

    private int avaliar(Tabuleiro tabuleiro) {
        char[][] b = tabuleiro.getGrid();
        for (int i = 0; i < 3; i++) {
            if (b[i][0] == b[i][1] && b[i][1] == b[i][2]) {
                if (b[i][0] == simbolo) return 10;
                else if (b[i][0] == oponente) return -10;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (b[0][j] == b[1][j] && b[1][j] == b[2][j]) {
                if (b[0][j] == simbolo) return 10;
                else if (b[0][j] == oponente) return -10;
            }
        }
        if (b[0][0] == b[1][1] && b[1][1] == b[2][2]) {
            if (b[0][0] == simbolo) return 10;
            else if (b[0][0] == oponente) return -10;
        }
        if (b[0][2] == b[1][1] && b[1][1] == b[2][0]) {
            if (b[0][2] == simbolo) return 10;
            else if (b[0][2] == oponente) return -10;
        }
        return 0;
    }
}