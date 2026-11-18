class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class pr3 {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Two Integers: " + c.add(10, 20));

        System.out.println("Two Doubles: " + c.add(10.5, 20.5));

        System.out.println("Three Marks: " + c.add(70, 80, 90));
    }
}
