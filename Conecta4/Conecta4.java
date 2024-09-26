package Conecta4;

    import java.util.Scanner;

public class Conecta4 {
    private static final int FILAS = 6;
    private static final int COLUMNAS = 7;
    private static char[][] tablero = new char[FILAS][COLUMNAS];

    public static void main(String[] args) {
        inicializarTablero();
        jugar();
    }

    private static void inicializarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = '.';
            }
        }
    }

    private static void jugar() {
        Scanner scanner = new Scanner(System.in);
        char jugadorActual = 'X';
        boolean ganador = false;

        while (!ganador) {
            imprimirTablero();
            System.out.println("Jugador " + jugadorActual + ", elige una columna (0-6): ");
            int columna = scanner.nextInt();

            if (columna < 0 || columna >= COLUMNAS || !puedeColocar(columna)) {
                System.out.println("Columna inválida, intenta de nuevo.");
                continue;
            }

            colocarFicha(columna, jugadorActual);
            ganador = verificarGanador(jugadorActual);

            if (ganador) {
                imprimirTablero();
                System.out.println("¡Jugador " + jugadorActual + " gana!");
            } else {
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }

    private static boolean puedeColocar(int columna) {
        return tablero[0][columna] == '.';
    }

    private static void colocarFicha(int columna, char jugador) {
        for (int i = FILAS - 1; i >= 0; i--) {
            if (tablero[i][columna] == '.') {
                tablero[i][columna] = jugador;
                break;
            }
        }
    }

    private static void imprimirTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("0 1 2 3 4 5 6");
    }

    private static boolean verificarGanador(char jugador) {
        // Verificar horizontal, vertical y diagonal
        return verificarHorizontal(jugador) || verificarVertical(jugador) || verificarDiagonal(jugador);
    }

    private static boolean verificarHorizontal(char jugador) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS - 3; j++) {
                if (tablero[i][j] == jugador && tablero[i][j + 1] == jugador &&
                    tablero[i][j + 2] == jugador && tablero[i][j + 3] == jugador) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean verificarVertical(char jugador) {
        for (int i = 0; i < FILAS - 3; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (tablero[i][j] == jugador && tablero[i + 1][j] == jugador &&
                    tablero[i + 2][j] == jugador && tablero[i + 3][j] == jugador) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean verificarDiagonal(char jugador) {
        // Verificar diagonal de izquierda a derecha
        for (int i = 0; i < FILAS - 3; i++) {
            for (int j = 0; j < COLUMNAS - 3; j++) {
                if (tablero[i][j] == jugador && tablero[i + 1][j + 1] == jugador &&
                    tablero[i + 2][j + 2] == jugador && tablero[i + 3][j + 3] == jugador) {
                    return true;
                }
            }
        }

        // Verificar diagonal de derecha a izquierda
        for (int i = 3; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS - 3; j++) {
                if (tablero[i][j] == jugador && tablero[i - 1][j + 1] == jugador &&
                    tablero[i - 2][j + 2] == jugador && tablero[i - 3][j + 3] == jugador) {
                    return true;
                }
            }
        }

        return false;
    }
}

