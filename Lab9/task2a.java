
public class task2a {
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
      task2a sum=new task2a();
      System.out.print(sum.maxSum(matrix,v,e));
      
   }
   String maxSum(int matrix[][], int v,int e){
      int sum1=0;
       int sum2=0;
       int rslt=0;
      for(int src=0; src<matrix.length;src++){
         sum1=0;
         for(int des=0;des<matrix[0].length;des++){
            
             sum1+=matrix[src][des];
            
         }
         if (sum2<sum1){
          sum2=sum1;
          rslt=src;
         }
      }
      
      return "vertex with max sum "+rslt+" with the sum of "+sum2;
   }
}
