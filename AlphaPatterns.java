package exercises;

/**
 *
 * @author MOPHE
 */
public class AlphaPatterns {

    public static void main(String[] args) {
        drawA();
        drawB();
        drawC();
        drawD();
        drawE();
        drawF();
        drawG();
        drawH();
        drawI();
        drawJ();
        drawK();
        drawL();
        drawM();
        drawN();
        drawO();
        drawP();
        drawQ();
        drawR();
        drawS();
        drawT();
        drawU();
        drawV();
        drawW();
        drawX();
        drawY();
        drawZ();
    }

    public static void drawA() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row == 1 && (col == 2 || col == size - 1))
                        || (row > 1 && (col == 1 || col == size))) {
                    System.out.print("*");
                } else if (col == 3 && row == 3) {
                    System.out.print("*");
                } else if (col == size && row == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawB() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row == 1 || row == size / 2 + 1 || row == size) && col < size) {
                    System.out.print("*");
                } else if (col == 1 && (row == 2 || row == size - 1)) {
                    System.out.print("*");
                } else if (col == size && (row == 2 || row == size - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawC() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row == 1 || row == size) && col > 1) {
                    System.out.print("*");
                } else if (col == 1 && (row > 1 && row < size)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawD() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == 1 || (row == 1 || row == size) && col < size || (row > 1 && row < size && col == size)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawE() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == 1 || row == 1 || row == size / 2 + 1 || row == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawF() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == 1 || row == 1 || row == size / 2 + 1 && col <= size / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawG() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row == 1 || row == size) && (col > 1 && col < size)) {
                    System.out.print("*");
                } else if (col == 1 && row > 1 && row < size) {
                    System.out.print("*");
                } else if (row == size / 2 + 1 && col >= size / 2 + 1) {
                    System.out.print("*");
                } else if (col == size && (row == 2 || row == size - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawH() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == 1 || col == size || row == size / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawI() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == size / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawJ() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || col == size / 2 + 1 || (row == size && col <= size / 2 + 1)) {
                    System.out.print("*");
                } else if (col == 1 && row > size / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawK() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == 1 || (row == col && col > size / 2 + 1) || (row == size - col + 1 && col > size / 2 + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawL() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == 1 || row == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawM() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == 1 || col == size || (row == col && col <= size / 2 + 1) || (col == size - row + 1 && col > size / 2 + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawN() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == 1 || col == size || row == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawO() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row == 1 || row == size) && (col > 1 && col < size)) {
                    System.out.print("*");
                } else if ((col == 1 || col == size) && (row > 1 && row < size)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawP() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == 1 || (row == 1 || row == size / 2 + 1) && col < size || (row > 1 && row < size / 2 + 1 && col == size)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawQ() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row == 1 || row == size) && (col > 1 && col < size)) {
                    System.out.print("*");
                } else if ((col == 1 || col == size) && (row > 1 && row < size)) {
                    System.out.print("*");
                } else if (row > size / 2 && col == size && row != size) {
                    System.out.print("*");
                } else if (row == size && col == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawR() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == 1 || (row == 1 && col < size) || (row == size / 2 + 1 && col <= size / 2 + 1) || (col == size && row > 1 && row <= size / 2 + 1) || (row > size / 2 + 1 && col == row)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawS() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row == 1 || row == size || row == size / 2 + 1) && (col > 1 && col < size)) {
                    System.out.print("*");
                } else if (row < size / 2 + 1 && col == 1) {
                    System.out.print("*");
                } else if (row > size / 2 + 1 && col == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawT() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || col == size / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawU() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((col == 1 || col == size) && row < size || (row == size && col > 1 && col < size)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawV() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row == col && col <= size / 2 + 1) || (col == size - row + 1 && col > size / 2 + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawW() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == 1 || col == size || (row == col && col > size / 2 + 1) || (row + col == size + 1 && col < size / 2 + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawX() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == row || col == size - row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawY() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((col == row || col == size - row + 1) && row <= size / 2 + 1) {
                    System.out.print("*");
                } else if (row > size / 2 + 1 && col == size / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawZ() {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == size - row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
