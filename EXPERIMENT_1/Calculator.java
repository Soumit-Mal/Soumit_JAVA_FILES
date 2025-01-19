class Number {
    double a;
    double b;
    Number(double a, double b) {
        this.a = a;
        this.b = b;
    }
    double add() {
        return a + b;
    }
    double subtract() {
        return a - b;
    }
    double multiply() {
        return a * b;
    }
    double divide() {
        return a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Number num = new Number(10, 5);

        System.out.println("Addition: " + num.add());
        System.out.println("Subtraction: " + num.subtract());
        System.out.println("Multiplication: " + num.multiply());
        System.out.println("Division: " + num.divide());
    }
}


