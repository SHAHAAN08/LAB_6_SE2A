class Money {
    int rupees;
    int paisa;

    Money(int rupees, int paisa) {

        this.rupees = rupees;
        this.paisa = paisa;
    }
    void display() {

        System.out.println(
            "Rs. " + rupees + "." +
            String.format("%02d", paisa)
        );
    }
}

public class pr4 {
    public static void main(String[] args) {

        Money m1 = new Money(1500, 50);

        m1.display();
    }
}
