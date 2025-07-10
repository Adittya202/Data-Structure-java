//Assignment Task 01: Container with Most Water
class AssgnTask1{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void mostWater( Integer[] height ){
        int q=0;
        int mul=0;
        int fin=0;
        for(int p=0;p<=height.length-1;p++){
            q=p+1;
            for(int i=q;i<height.length;i++){
                if(height[p]< height[q]){
                    mul=(height[p]*(q-p));
                    if (mul>fin) {

                        fin=mul;
                    }
                }else{
                     mul=(height[q]*(q-p));
                     if (mul>fin) {
                        fin=mul;
                     }
                }
                q++;
            }
        }
        System.out.println(fin);

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
	System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}
