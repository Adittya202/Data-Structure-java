//Assignment Task (must Submit)
// Complete the rangeSum method
public class Task4 {

    //===================================TASK#4======================
    // This method takes only three parameters
    // first one is the root of the given tree
    // second one the low range and third one is high range
    // You can use extra helper private static methods as per need
    public static Integer rangeSum( BSTNode root, Integer low, Integer high ){
       

        return sum(root,low,high); 
    }
    private static int sum(BSTNode root, Integer low, Integer high){
        int add=0;
         if(root==null){
            return 0;
        }
        if((int)root.elem>=low && (int)root.elem<=high){
            add+=(int)root.elem;
        }
        

           if(low<(int)root.elem){
            add+=sum(root.left,low,high);
           }
           if(high>(int)root.elem){
            add+=  sum(root.right,low,high);
           }
             
            return add;
        }
      
    
    //===============================================================


}
