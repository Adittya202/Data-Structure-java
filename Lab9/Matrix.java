import java.util.Scanner;
public class Matrix{
public static void main(String[] args) {
    int v=7;
    int e=16;
int matrix[][] =new int[v][v];
for(int i=0; i<e;i++){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter source");
    int src=sc.nextInt();
    System.out.print("Enter destination");
    int des=sc.nextInt();
    matrix[src][des]=1;
    matrix[des][src]=1;
}

}
}