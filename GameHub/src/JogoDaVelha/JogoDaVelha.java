package JogoDaVelha;

import java.util.Scanner;
import java.util.Random;

public class JogoDaVelha {
    public static void jogar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 1 Jogador (vs Bot)");
        System.out.println("2. 2 Jogadores (Local)");
        int modo = scanner.nextInt();

        Jogador jogador1 = null;
        Jogador jogador2 = null;

        if (modo == 1) {
            System.out.println("1. Ir primeiro (X)");
            System.out.println("2. Ir segundo (O)");
            System.out.println("3. Aleatorio");
            int ordem = scanner.nextInt();

            if (ordem == 3) {
                ordem = new Random().nextBoolean() ? 1 : 2;
            }

            if (ordem == 1) {
                jogador1 = new Humano('X');
                jogador2 = new Bot('O');
            } else {
                jogador1 = new Bot('X');
                jogador2 = new Humano('O');
            }
        } else {
            jogador1 = new Humano('X');
            jogador2 = new Humano('O');
        }

        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador atual = jogador1;

        while (true) {
            tabuleiro.imprimir();
            int[] jogada = atual.escolherJogada(tabuleiro, scanner);
            tabuleiro.fazerJogada(jogada[0], jogada[1], atual.getSimbolo());

            if (tabuleiro.verificarVitoria(atual.getSimbolo())) {
                tabuleiro.imprimir();
                System.out.println("Jogador " + atual.getSimbolo() + " venceu!");
                break;
            }
            if (tabuleiro.estaCheio()) {
                tabuleiro.imprimir();
                System.out.println("Deu velha (Empate)!");
                break;
            }

            atual = (atual == jogador1) ? jogador2 : jogador1;
        }
    }
}