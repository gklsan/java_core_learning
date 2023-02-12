class Calculator {
    public int add(int a, int b) {
        System.out.println("Inside add function....");
        return a + b;
    }

    public int add(int a, int b, int c) {
        return add(a, b) + c;
    }
}

public class KlassAndObject {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        System.out.println(i+j);
        Calculator calculator = new Calculator();
        int result = calculator.add(i, j);
        int result1 = calculator.add(i, j, 10);
        System.out.println(result);
        System.out.println(result1);
    }
}
