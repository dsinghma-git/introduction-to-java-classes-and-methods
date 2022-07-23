

public class CalVolume {
    
    public int findVolume(int l, int b,int h)
    {
        return l*b*h;
    }

    public float findVolume(float l, float b, float h)
    {
        return l*b*h;
    }
    public int findVolume(int l)
    {
        return l*l*l;
    }

    public static void main(String [] args)
    {
        CalVolume cv = new CalVolume();
        int v1 = cv.findVolume(10,8,6);
        System.out.println("Volume of the box1 = "+v1);
        float v2 = cv.findVolume(10.0f,5.5f,8.5f);
        System.out.println("Volume of the box2 =" +v2);
        int v3 = cv.findVolume(10);
        System.out.println("Volume of box3 = "+v3);
    }
}