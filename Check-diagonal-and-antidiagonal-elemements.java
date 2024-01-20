public class Helloworld {
    public static void main(String[] args) {
        char[][] matrix = {
            {'x', 'o', 'o','x'},
            {'o', 'x', 'x','o'},
            {'o', 'x', 'x','o'},
            {'x', 'o', 'o','x'}
        };
    System.out.println("diagonal elements same : " + checkDiagonal(matrix));
    System.out.println(" Another elements same : "+otherelement(matrix));
    }

    public static boolean checkDiagonal(char[][] matrix) {
        int n = matrix.length;

        char mainDiagonal = matrix[0][0];
        for (int i = 1; i < n; i++) {
            if (matrix[i][i] != mainDiagonal) {
                return false;
            }
        }
        char antiDiagonal = matrix[0][n-1];
        for (int i = 1; i < n; i++) {
            if (matrix[i][n-1-i] != antiDiagonal) {
                return false;
            }
        }

        return true;
    }
    public static boolean otherelement(char[][] matrix){
        int m = matrix.length;
        char otherele = matrix[0][1];
        for (int k = 0; k < m; k++) {
            for (int l = 0; l < m; l++) {
                if (k == l || k+l == m-1) {
                    continue;
                }
                if (matrix[k][l] != otherele) {
                    return false;
                }
            }
        }

        return true;
    }
}
