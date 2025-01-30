public class MatrixOperations {

    // Addition Operation on twomatrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] S = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                S[i][j] = A[i][j] + B[i][j];
            }
        }
        return S;
    }

    // Subtraction Operation on two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] D = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                D[i][j] = A[i][j] - B[i][j];
            }
        }
        return D;
    }

    //Multiplication Operation on two matrices
    public static int[][] multiplicationMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] M = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                M[i][j] = A[i][j] * B[i][j];
            }
        }
        return M;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Addition Operation
        int[][] sum = addMatrices(A, B);
        System.out.println("Matrix A + Matrix B:");
        printMatrix(sum);

        // Subtraction Operation
        int[][] difference = subtractMatrices(A, B);
        System.out.println("Matrix A - Matrix B:");
        printMatrix(difference);

        //Multiplying 
        int[][] multiplication = multiplicationMatrices(A, B);
        System.out.println("Matrix A * Matrix B:");
        printMatrix(multiplication);
    }
}