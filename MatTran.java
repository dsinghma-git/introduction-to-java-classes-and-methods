import java.util.Scanner;

public class MatTran {
   public static void main(String []args)
   {
       int [][] a = new int [2][3];
       int [][] t = new int [3][2];
       int i,j;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a 2x3 matrix: ");
       for(i=0;i<2;i++)
       {
           for(j=0;j<3;j++)
           {
               a[i][j] = sc.nextInt();
           }
       }
       // transposing the matrix
       for(i=0;i<2;i++)
       {
           for(j=0;j<3;j++)
           {
               t[j][i]=a[i][j];
           }
       }
       System.out.println("Given matrix is: ");
       for(i=0;i<2;i++)
       {
           for(j=0;j<3;j++)
           {
               System.out.print(a[i][j]+"\t");
           }
           System.out.println();
       }
       System.out.println("Transpose matrix is: ");
       for(i=0;i<3;i++)
       {
           for(j=0;j<2;j++)
           {
               System.out.print(t[i][j]+"\t");
           }
           System.out.println();
       }
   } 
}
