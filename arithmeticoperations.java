import java.util.Scanner;

    class ArithmeticOperations {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

 
        double sum = num1 + num2;          // Addition
        double difference = num1 - num2;   // Subtraction
        double product = num1 * num2;      // Multiplication
        double quotient = num1 / num2;     // Division
        double remainder = num1 % num2;    // Modulus

     
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
        System.out.println("Modulus: " + num1 + " % " + num2 + " = " + remainder);


        scanner.close();
    }
}