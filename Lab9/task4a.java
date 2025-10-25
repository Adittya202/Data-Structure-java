public class task4a {
    public static void main(String[] args) {
        int v = 7;
        int e = 16;
        int matrix[][] = {
                { 0, 2, 2, 6, 0, 0, 6 },
                { 2, 0, 4, 2, 2, 5, 0 },
                { 2, 4, 0, 0, 5, 2, 2 },
                { 6, 2, 0, 0, 2, 5, 0 },
                { 0, 2, 5, 2, 0, 2, 5 },
                { 0, 5, 2, 5, 2, 0, 2 },
                { 6, 0, 2, 0, 5, 2, 0 }
        };
        task4a unDir = new task4a();
        unDir.unDirect(matrix, v);
    }

    void unDirect(int matrix[][], int v) {
        for (int src = 0; src < v; src++) {
            for (int des = 0; des < matrix[0].length; des++) {
                if(matrix[src][des]!=0){
                    matrix[des][src]=matrix[src][des];
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }
}
