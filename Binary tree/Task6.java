
//ASSIGNMENT TASK MUST SUBMIT
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        //TO DO

        return evenlvl(root,  1) - oddlvl(root,1);
    }

    private static Integer evenlvl(BTNode root,int lvl){
        int evensum=0;
        if(root==null){
            return 0;
        }
        if(lvl%2==0){
         evensum=evenlvl(root.left,lvl+1) + evenlvl(root.right,lvl+1)+(int)root.elem;
         return evensum;
        }else{
            return evenlvl(root.left,lvl+1) + evenlvl(root.right,lvl+1);
        }
        
    }

    private static Integer oddlvl(BTNode root,int lvl){
        int oddsum=0;
         if(root==null){
            return 0;
        }
         if(lvl%2!=0){
         oddsum=oddlvl(root.left,lvl+1) + oddlvl(root.right,lvl+1)+(int)root.elem;
         return oddsum;
        }else{
           return evenlvl(root.left,lvl+1) + evenlvl(root.right,lvl+1);
        }
    }



    }
    //============================================================================


