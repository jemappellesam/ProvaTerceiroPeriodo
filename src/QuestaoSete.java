public class QuestaoSete {
    public static void main(String[] args) {
        int [] [] matrix = new int[2][2];
         matrix[0][0]=1;
         matrix[0][1]=2;
         matrix[1][0]=3;
         matrix[1][1]=4;
        System.out.println(determinant(matrix));

        }
        public static int determinant(int [][]matrix) {
            if (matrix.length > 2) {
                System.out.println("Matriz de tamanho inapropriado");
                return 0;
            } else {
                int MainDiagonal = matrix[0][0] * matrix[1][1];
                int Diagonal = matrix[0][1] * matrix[1][0];
                return (MainDiagonal - Diagonal);
            }

        }
    }

