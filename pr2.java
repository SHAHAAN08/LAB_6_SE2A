class Calculator {

    int add(int a, int b) {
        System.out.println("Integer method called");
        return a + b;
    }

    double add(double a, double b) {
        System.out.println("Double method called");
        return a + b;
    }
}

public class pr2 {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        int result1 = c.add(5, 10);

        double result2 = c.add(5.5, 10.5);

        System.out.println("Integer Result: " + result1);
        System.out.println("Double Result: " + result2);
    }
}
