//Assignment Task 03: Matrix Compression
class AssgnTask3 {

    // Complete this method so that it gives the Expected Output
    // YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer[][] compressMatrix( Integer[][] matrix ){

       Integer array[][]=new Integer[2][2];
       int col=0;
       int temp=0;
       for (int row = 0; row < matrix.length/2; row++) {
        col=0;
        temp+=matrix[row][col++] + matrix[row][col];
        array[0][0]=temp;
       }
       temp=0;
       for (int row = 0; row < matrix.length/2; row++) {
        col=2;
        temp+=matrix[row][col++] + matrix[row][col];
        array[0][1]=temp;
       }
       temp=0;
       for (int row=2; row < matrix.length; row++) {
        col=0;
        temp+=matrix[row][col++] + matrix[row][col];
        array[1][0]=temp;
       }
       temp=0;
       for (int row = 2; row < matrix.length; row++) {
        col=2;
        temp+=matrix[row][col++] + matrix[row][col];
        array[1][1]=temp;
       }


        return array;
    }

    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        Integer[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 1, 3, 5, 2 },
                { -2, 0, 6, -3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);

        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");

        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix(matrix);
        Arr.print2D(returnedArray);
    }
}