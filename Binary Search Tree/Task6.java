//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST( BSTNode root ){
        
       
        int count=helper(root,0);
        int arr[]=new int[count];
        arr=helper2(root,arr,0);
        int a=0;
        int b=0;
        for(int i=0;i<count;i++){
            b=arr[i];
            if(b==0){
                continue;
            }
            if(b<a){
                return false;
            }
            a=b;
        }
        return true;
    }
    private static int helper(BSTNode root,int count){
        
         if(root==null){
            return count+1;
        }
       count= helper(root.left,count);
       count= helper(root.right,count);
        return count+1;
    } 
    private static int[] helper2( BSTNode root,int[] arr,int i){
        
        if(root==null){
            arr[i]=0;
            return arr;
        }
         helper2(root.left,arr,i+1);
        helper2(root.right,arr,i+1);
        arr[i]=(int)root.elem;
         return arr;
    }
    //===============================================================


}
