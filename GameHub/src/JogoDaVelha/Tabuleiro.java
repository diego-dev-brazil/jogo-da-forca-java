package JogoDaVelha;

public class Tabuleiro {
    private char[][] grid;

    public Tabuleiro() {
        grid = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = '-';
            }
        }
    }

    public char[][] getGrid() {
        return grid;
    }

    public boolean jogadaValida(int linha, int coluna) {
        return linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && grid[linha][coluna] == '-';
    }

    public void fazerJogada(int linha, int coluna, char simbolo) {
        grid[linha][coluna] = simbolo;
    }

    public void desfazerJogada(int linha, int coluna) {
        grid[linha][coluna] = '-';
    }

    public boolean estaCheio() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == '-') return false;
            }
        }
        return true;
    }

    public boolean verificarVitoria(char simbolo) {
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == simbolo && grid[i][1] == simbolo && grid[i][2] == simbolo) return true;
            if (grid[0][i] == simbolo && grid[1][i] == simbolo && grid[2][i] == simbolo) return true;
        }
        if (grid[0][0] == simbolo && grid[1][1] == simbolo && grid[2][2] == simbolo) return true;
        if (grid[0][2] == simbolo && grid[1][1] == simbolo && grid[2][0] == simbolo) return true;
        return false;
    }

    public void imprimir() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}