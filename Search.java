// Linear search in java
// This program is used to search an item sequentially in the list of 10 numbers
import java.util.Scanner;
public class Search {
    public static void main(String [] args)
    {
        int [] a = {10,5,8,15,16,20,25,35,75,50};
        int k;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter search item");
        k = sc.nextInt();
        for(i=0;i<10;i++)
        {
            if(a[i]==k)
            {
                System.out.println("Search key " + k + " is found. ");
                break;
            }
        }
        if(i==10)
            System.out.println("Search key "+ k + " is not found.");
    }
}
