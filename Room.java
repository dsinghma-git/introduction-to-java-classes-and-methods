class Room
{
    private int length;
    private int breadth;

    public Room()
    {
        length =10;
        breadth =10;
    }
    int findArea()
    {
        return length*breadth;
    }
    void display()
    {
        System.out.println("Length of room = "+length);
        System.out.println("Breadth of Room = "+breadth);
        System.out.println("Area of room = "+findArea());
    }

    public static void main(String [] arg)
    {
        Room r1 = new Room();
        r1.display();
    }
}