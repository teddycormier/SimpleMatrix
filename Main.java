public class Main {
    public static void main(String[] args) {
        int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

        int c[][] = new int[3][3];

        System.out.println("\nMatrix: \n--------");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                if ((c[i][j]) < 10) {
                    System.out.print("0" + c[i][j] + " ");
                } else {
                    System.out.print(c[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("--------\n");
    }
}
