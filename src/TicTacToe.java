import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] array = new String[3][3];
        int whoWin = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = "_";
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Player 1:");
        int[] c = action();
        int a = c[0];
        int b = c[1];
        while (array[b - 1][a - 1] != "_") {
            System.out.println("Значение занято. Введи новое значение.");
            c = action();
            a = c[0];
            b = c[1];
        }
        array[b - 1][a - 1] = "X";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        whoWin = check(array);
        if (whoWin == 1) {
            System.out.println("Player 1 wins");
            return;
        } else if (whoWin == 2) {
            System.out.println("Player 2 wins");
            return;
        }
        System.out.println("Player 2:");
        c = action();
        a = c[0];
        b = c[1];
        while (array[b - 1][a - 1] != "_") {
            System.out.println("Значение занято. Введи новое значение.");
            c = action();
            a = c[0];
            b = c[1];
        }
        array[b - 1][a - 1] = "O";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        whoWin = check(array);
        if (whoWin == 1) {
            System.out.println("Player 1 wins");
            return;
        } else if (whoWin == 2) {
            System.out.println("Player 2 wins");
            return;
        }
        System.out.println("Player 1:");
        c = action();
        a = c[0];
        b = c[1];
        while (array[b - 1][a - 1] != "_") {
            System.out.println("Значение занято. Введи новое значение.");
            c = action();
            a = c[0];
            b = c[1];
        }
        array[b - 1][a - 1] = "X";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        whoWin = check(array);
        if (whoWin == 1) {
            System.out.println("Player 1 wins");
            return;
        } else if (whoWin == 2) {
            System.out.println("Player 2 wins");
            return;
        }
        System.out.println("Player 2:");
        c = action();
        a = c[0];
        b = c[1];
        while (array[b - 1][a - 1] != "_") {
            System.out.println("Значение занято. Введи новое значение.");
            c = action();
            a = c[0];
            b = c[1];
        }
        array[b - 1][a - 1] = "O";
        for (
                int i = 0;
                i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        whoWin = check(array);
        if (whoWin == 1) {
            System.out.println("Player 1 wins");
            return;
        } else if (whoWin == 2) {
            System.out.println("Player 2 wins");
            return;
        }
        System.out.println("Player 1:");
        c = action();
        a = c[0];
        b = c[1];
        while (array[b - 1][a - 1] != "_") {
            System.out.println("Значение занято. Введи новое значение.");
            c = action();
            a = c[0];
            b = c[1];
        }
        array[b - 1][a - 1] = "X";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        whoWin = check(array);
        if (whoWin == 1) {
            System.out.println("Player 1 wins");
            return;
        } else if (whoWin == 2) {
            System.out.println("Player 2 wins");
            return;
        }
        System.out.println("Player 2:");
        c = action();
        a = c[0];
        b = c[1];
        while (array[b - 1][a - 1] != "_") {
            System.out.println("Значение занято. Введи новое значение.");
            c = action();
            a = c[0];
            b = c[1];
        }
        array[b - 1][a - 1] = "O";
        for (
                int i = 0;
                i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        whoWin = check(array);
        if (whoWin == 1) {
            System.out.println("Player 1 wins");
            return;
        } else if (whoWin == 2) {
            System.out.println("Player 2 wins");
            return;
        }
        System.out.println("Player 1:");
        c = action();
        a = c[0];
        b = c[1];
        while (array[b - 1][a - 1] != "_") {
            System.out.println("Значение занято. Введи новое значение.");
            c = action();
            a = c[0];
            b = c[1];
        }
        array[b - 1][a - 1] = "X";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        whoWin = check(array);
        if (whoWin == 1) {
            System.out.println("Player 1 wins");
            return;
        } else if (whoWin == 2) {
            System.out.println("Player 2 wins");
            return;
        }
        System.out.println("Player 2:");
        c = action();
        a = c[0];
        b = c[1];
        while (array[b - 1][a - 1] != "_") {
            System.out.println("Значение занято. Введи новое значение.");
            c = action();
            a = c[0];
            b = c[1];
        }
        array[b - 1][a - 1] = "O";
        for (
                int i = 0;
                i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        whoWin = check(array);
        if (whoWin == 1) {
            System.out.println("Player 1 wins");
            return;
        } else if (whoWin == 2) {
            System.out.println("Player 2 wins");
            return;
        }
        System.out.println("Player 1:");
        c = action();
        a = c[0];
        b = c[1];
        while (array[b - 1][a - 1] != "_") {
            System.out.println("Значение занято. Введи новое значение.");
            c = action();
            a = c[0];
            b = c[1];
        }
        array[b - 1][a - 1] = "X";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        whoWin = check(array);
        if (whoWin == 1) {
            System.out.println("Player 1 wins");
            return;
        } else if (whoWin == 2) {
            System.out.println("Player 2 wins");
            return;
        } else {
            System.out.println("Ничья");
        }
    }

    public static int[] action() {
        int a = 0;
        while (a < 1 || a > 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Координата по горизонтали (1-3):");
            while (a < 1 || a > 3) {
                a = sc.nextInt();
            }
        }
        int b = 0;
        while (b < 1 || b > 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Координата по вертикали (1-3):");
            while (b < 1 || b > 3) {
                b = sc.nextInt();
            }
        }
        int[] array = new int[]{a, b};
        return array;
    }

    public static int check(String[][] array) {
        int whoWin = 0;
        if ((array[0][0] == array[0][1] && array[0][0] == array[0][2] && array[0][0] == "X") ||
                (array[1][0] == array[1][1] && array[1][0] == array[1][2] && array[1][0] == "X") ||
                (array[2][0] == array[2][1] && array[2][0] == array[2][2] && array[2][0] == "X") ||
                (array[0][0] == array[1][0] && array[0][0] == array[2][0] && array[0][0] == "X") ||
                (array[0][1] == array[1][1] && array[0][1] == array[2][1] && array[0][1] == "X") ||
                (array[0][2] == array[1][2] && array[0][2] == array[2][2] && array[0][2] == "X") ||
                (array[0][0] == array[1][1] && array[0][0] == array[2][2] && array[0][0] == "X") ||
                (array[0][2] == array[1][1] && array[0][2] == array[2][0] && array[0][2] == "X")) {
            whoWin = 1;
        } else if ((array[0][0] == array[0][1] && array[0][0] == array[0][2] && array[0][0] == "O") ||
                (array[1][0] == array[1][1] && array[1][0] == array[1][2] && array[1][0] == "O") ||
                (array[2][0] == array[2][1] && array[2][0] == array[2][2] && array[2][0] == "O") ||
                (array[0][0] == array[1][0] && array[0][0] == array[2][0] && array[0][0] == "O") ||
                (array[0][1] == array[1][1] && array[0][1] == array[2][1] && array[0][1] == "O") ||
                (array[0][2] == array[1][2] && array[0][2] == array[2][2] && array[0][2] == "O") ||
                (array[0][0] == array[1][1] && array[0][0] == array[2][2] && array[0][0] == "O") ||
                (array[0][2] == array[1][1] && array[0][2] == array[2][0] && array[0][2] == "O")) {
            whoWin = 2;
        }
        return whoWin;
    }
}
