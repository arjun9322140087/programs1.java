    class CastingExample {
    public static void main(String[] args) {
       
        int intValue = 100;
        double doubleValue = intValue; // int to double (implicit)
        System.out.println("Implicit Casting:");
        System.out.println("Integer Value: " + intValue);
        System.out.println("Double Value (after implicit casting): " + doubleValue);

       
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double to int (explicit)
        System.out.println("\nExplicit Casting:");
        System.out.println("Double Value: " + anotherDoubleValue);
        System.out.println("Integer Value (after explicit casting): " + anotherIntValue);
    }
}