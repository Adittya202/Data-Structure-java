//Assignment Task 04: Game Arena
class AssgnTask4{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void playGame( Integer[][] arena ){

        int cell=0;
        for(int row=0; row<arena.length; row++){
           for (int col = 0; col < arena[0].length; col++) {
            if (arena[row][col]!=0 && arena[row][col]%50==0) {
                if (col+1 <arena[0].length && arena[row][col+1]==2) {
                    cell++;
                }
                 if (col-1>=0 && arena[row][col-1]==2) {
                    cell++;
                }
                 if (row-1>=0 && arena[row-1][col]==2) {
                    cell++;
                }
                 if (row+1 < arena.length && arena[row+1][col]==2) {
                    cell++;
                }
            }
           }    
            
        }
        if ((cell*2)<10) {
            System.out.println("Points Gained "+(cell*2)+". Your team is out.");
            
        }else{
            System.out.println("Points Gained "+(cell*2)+". Your team has survived the game.");
        }
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}