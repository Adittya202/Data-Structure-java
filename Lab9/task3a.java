public class task3a {
    public static void main(String[] args) {
        int v = 7;
        int e = 16;
        int degree = 0;
        int matrix[][] = {
                { 0, 2, 2, 6, 0, 0, 6 },
                { 0, 0, 4, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0 },
                { 0, 2, 0, 0, 2, 5, 0 },
                { 0, 0, 5, 0, 0, 2, 5 },
                { 0, 0, 2, 0, 0, 0, 0 },
                { 6, 0, 2, 0, 0, 2, 0 }
        };
        task3a deg = new task3a();
        System.out.print(deg.maxdegree(matrix, v, e, degree));
    }

    String maxdegree(int matrix[][], int v, int e, int degree) {
        String a = "";
        int degree2 = 0;
        for (int src = 0; src < v; src++) {
            degree = 0;
            for (int des = 0; des < matrix[0].length; des++) {
                if (matrix[src][des] != 0) {
                    degree++;
                }

            }
            if (degree2 < degree) {
                degree2 = degree;
                a = "vertex  " + src + " degree " + degree2;
            }
        }
        return a;
    }
}
