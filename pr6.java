
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

public class pr6 {

    public static void main(String[] args) {

        Money m1 = new Money(1500, 50);

        Money m2 = new Money(750, 75);

        Money total = m1.add(m2);

        System.out.print("First Money: ");
        m1.display();

        System.out.print("Second Money: ");
        m2.display();

        System.out.print("Total Money: ");
        total.display();
    }
}
