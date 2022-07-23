public class Money 
{
    int rupee;
    int paisa;

    void setMoney(int r, int p)
    {
        rupee = r;
        paisa = p;
    }
    void displayMoney()
    {
        System.out.println("Rupees = "+rupee);
        System.out.println("Paisa = "+paisa);
    }

    void addMoney(Money m1, Money m2)
    {
        this.paisa = m1.paisa + m2.paisa;
        this.rupee = m1.rupee + m2.rupee + this.paisa/100;
        this.paisa = this.paisa % 100;
    }

    public static void main(String [] args)
    {
        Money m1 = new Money();
        Money m2 = new Money();
        Money m3 = new Money();
        m1.setMoney(5, 75);
        m2.setMoney(7, 30);
        m1.displayMoney();
        m2.displayMoney();
        m3.addMoney(m1, m2);
        m3.displayMoney();
    }
}
