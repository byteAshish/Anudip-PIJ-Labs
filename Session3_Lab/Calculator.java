package anudip.Assignments.Session3_Lab;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add(5, 10): " + calc.add(5, 10));
        System.out.println("add(1, 2, 3): " + calc.add(1, 2, 3));
        System.out.println("add(4.5, 3.2): " + calc.add(4.5, 3.2));
    }
}

