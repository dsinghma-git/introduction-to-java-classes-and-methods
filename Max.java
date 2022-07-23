// to find maximum number from a list of 10 numbers
import java.util.Scanner;
public class Max {
    /**
     * @param args
     */
    public static void main(String [] args)
    {
        int [] a = new int[10];
        int i, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers ");
        for(i=0;i<10;i++)
        {
            a[i]= sc.nextInt();
        }
        max = a[0];
        for(i=1;i<10;i++)
        {
            if(a[i]>max)
                max = a[i];
        }
        System.out.println("Maximum value = " + max);
        sc.close();
    }
}

