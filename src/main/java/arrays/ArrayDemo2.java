package arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int [] [] matrix = {
                {4, 5, 2, 7, 8},
                {78, 7},
                {4, 6, 2,}
        };

        printMatrix(matrix);
    }

    public static void printMatrix(int [] [] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Element in position %d%d is %d\n", i, j, matrix[i][j]);
            }
        }
    }
}
