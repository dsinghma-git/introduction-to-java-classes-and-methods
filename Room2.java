//Constructor overloading
// A class contains many constructors
import java.util.Scanner;
public class Room2 {
    private double length;
    private double breadth;
    private double height;

    Room2()
    {
        this.length = 20;
        this.breadth = 30;
        this.height = 15;
    }
    Room2(double l, double b , double h)
    {
        length = l;
        breadth = b;
        height =h;
    }
    void displayData()
    {
        System.out.println("length of room = " + length);
        System.out.println("breadth of room = "+breadth);
        System.out.println("height of room ="+height);
    }
    double findVolume()
    {
        return length *breadth*height;
    }
   public static void main(String [] args)
   {
     Room2 r1 = new Room2();
     r1.displayData();
     double v1 = r1.findVolume();
     System.out.println("Volume of room1 = "+v1);
     
     Scanner s= new Scanner(System.in);
     System.out.println("Enter l, b and h ");
     double l = s.nextDouble();
     double b = s.nextDouble();
     double h = s.nextDouble();
     Room2 r2 = new Room2(l,b,h);
     r2.displayData();
     double v2 = r2.findVolume();
     System.out.println("Volume of room2 = "+ v2);
    s.close();
   }  
}
