class Money {

    int rupees;
    int paisa;

    Money(int rupees, int paisa) {

        this.rupees = rupees;
        this.paisa = paisa;
    }

    Money add(Money other) {

        int totalPaisa = this.paisa + other.paisa;

        int totalRupees =
            this.rupees + other.rupees;

        totalRupees += totalPaisa / 100;

        totalPaisa = totalPaisa % 100;

        return new Money(totalRupees, totalPaisa);
    }

    void display() {

        System.out.printf(
            "Rs. %d.%02d%n",
            rupees, paisa
        );
    }
}

public class pr5 {

    public static void main(String[] args) {

        Money m1 = new Money(1500, 50);

        Money m2 = new Money(750, 75);

        Money result = m1.add(m2);

        result.display();
    }
}
