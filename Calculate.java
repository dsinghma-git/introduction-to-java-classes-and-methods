//This program demonstrates method overloading

public class Calculate {

    public int add(int a, int b)
    {
        return a+b;
    }
    public int add(int a, int b , int c)
    {
        return a+b+c;
    }

    public int add(int x)
    {
        return x + 10;
    }
    public float add(float x, float y)
    {
        return x+y;
    }

  public static void main(String [] args)
  {
    Calculate c = new Calculate();
    System.out.println("Sum1 = "+c.add(10,20));
    System.out.println("Sum2 = "+ c.add(5,2,10));
    System.out.println("Sum3 = "+c.add(50));
    System.out.println("Sum4 = "+c.add(10.50f,5.05f));
  }
}
