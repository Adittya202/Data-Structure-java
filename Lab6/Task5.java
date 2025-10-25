// Complete the subtractSummation method
//ASSIGNMENT TASK MUST SUBMIT
public class Task5 {

    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer subtractSummation( BTNode root ){
        //TO DO
        
        return leftsum( root.left)-rightsum( root.right);
    }
    private static Integer leftsum(BTNode root){
        
        if(root==null){
            return 0;
        }
        int sum1=leftsum(root.left)+leftsum(root.right)+(int)root.elem;
        return sum1;
    }
     private static Integer rightsum(BTNode root){
        
        if(root==null){
            return 0;
        }
        int sum2=rightsum(root.left)+rightsum(root.right)+(int)root.elem;
        return sum2;
    }
    //============================================================================

}
