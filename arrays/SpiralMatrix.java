public class SpiralMatrix {
    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int startCol =  0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j= startCol; j<=endCol; j++){
                System.out.println(matrix[startRow][j]+" ");
            }

            //right
            for(int i=startRow; i<=endRow; i++){
                System.out.println(matrix[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    return;
                }
                System.out.println(matrix[endRow][j] + " ");
            }

            //left
            for(int i=endRow-1; i>startRow+1; i--){
                System.out.println(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static int diagonalSum(int matrix[][]){ //0(N)
        int sum = 0;

        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i + j == matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0; i<matrix.length; i++){
            //primary diagonal
            sum += matrix[i][i];

            //secondary diagonal
            if(i != matrix.length - 1 - i){ //to avoid adding the middle element twice in odd sized matrix
                sum += matrix[i][matrix.length - 1 - i];
            }
        }

        return sum;
    }

    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Key found at (" + row + "," + col + ")");
                return true;
            }

            else if(key < matrix[row][col]){
                col--;
            }

            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int key = 15;
        System.out.println(staircaseSearch(matrix, key));
    }
}
