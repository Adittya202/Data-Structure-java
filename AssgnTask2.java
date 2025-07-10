//Assignment Task 02: Row Rotation Policy
class AssgnTask2 {

    // Complete this method so that it gives the Expected Output
    // YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer rowRotation(Integer examWeek, String[][] matrix) {


        String temp = "";
        for (int i = 0; i < examWeek - 1; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                temp = matrix[5][j];
                for (int k = 5; k >= 1; k--) {
                    matrix[k][j] = matrix[k - 1][j];
                }
                matrix[0][j] = temp;

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("| " + matrix[i][j] + "  ");
            }
            System.out.print("|");
            System.out.println();
        }

        Integer Row = 0;
        for (int i1 = 0; i1 < matrix.length; i1++) {
            Row++;
            for (int i = 0; i < matrix[0].length; i++) {

                if (matrix[i1][i] == "AA") {
                    return Row;
                }
            }

        }
        return Row;

    }

    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        String[][] seatStatus = {
                { "A", "B", "C", "D", "E" },
                { "F", "G", "H", "I", "J" },
                { "K", "L", "M", "N", "O" },
                { "P", "Q", "R", "S", "T" },
                { "U", "V", "W", "X", "Y" },
                { "Z", "AA", "BB", "CC", "DD" }
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);

        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");

        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        // This following should print modified seat status after rotation and return
        // the current exam week
        Integer rowNumber = rowRotation(examWeek, seatStatus);
        // The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row " + rowNumber);
    }
}