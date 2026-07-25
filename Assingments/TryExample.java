public class TryExample {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b;   // Error occurs here
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
            System.out.println("Solution: Use a non-zero denominator.");
        }

        System.out.println("Program continues after exception handling.");
    }
}