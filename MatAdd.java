import java.util.Scanner;
class MatAdd
{
    public static void main(String [] args)
    {
        int [][] a = new int[2][2];
        int [][] b = new int[2][2];
        int [][] c = new int[2][2];
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter a 2 x 2 matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second 2 x 2 matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        // code for adding matrices
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                c[i][j]=a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of the given matrices:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }
}