public class operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;  
    
        int difference = a - b; // Arithmetic Operators
        int product = a * b;
        int quotient = a / b;
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        
        boolean andResult = (a < b) && (b > a); // Logical Operators
        boolean orResult = (a < b) || (b < a);
        System.out.println("Logical AND: " + andResult);
        System.out.println("Logical OR: " + orResult);

        boolean greaterThan = a > b; // Relational Operators
        boolean lessThan = a < b;
        boolean equalTo = a == b;
        System.out.println("Greater than: " + greaterThan);
        System.out.println("Less than: " + lessThan);
        System.out.println("Equal to: " + equalTo);
    }
}






