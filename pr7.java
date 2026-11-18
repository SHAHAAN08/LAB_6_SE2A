
class Money {

    int rupees;
    int paisa;

    Money(int rupees, int paisa) {
        this.rupees = rupees;
        this.paisa = paisa;
    }

    Money add(Money other) {

        int p = paisa + other.paisa;
        int r = rupees + other.rupees + (p / 100);

        return new Money(r, p % 100);
    }

    void display() {
        System.out.printf("Rs. %d.%02d%n", rupees, paisa);
    }
}

public class pr7 {

    public static void main(String[] args) {

        Money m1 = new Money(125, 80);

        Money m2 = new Money(74, 45);

        Money result = m1.add(m2);

        System.out.print("First Amount: ");
        m1.display();

        System.out.print("Second Amount: ");
        m2.display();

        System.out.print("Total Amount: ");
        result.display();
    }
}
