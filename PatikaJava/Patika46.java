package PatikaJava;

public class Patika46 {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1,2,3}, {4, 5, 6}};
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matris : ");
        for (int[] is : matrix) {
            for (int i = 0; i < is.length; i++) {
                System.out.print(is[i] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("---------------------------");
        System.out.println("Tranpoze : ");
        for (int[] is : transpose) {
            for (int i = 0; i < is.length; i++) {
                System.out.print(is[i] + " ");
            }
            System.out.print("\n");
        }
    }
}
