class DataTypesExample {
    public static void main(String[] args) {

        int intValue = 10;
        double doubleValue = 20.5;
        char charValue = 'A';
        boolean booleanValue = true;

        String stringValue = "Hello";
        int[] intArray = {1, 2, 3};

        System.out.println("Primitive Data Types:");
        System.out.println("int: "+intValue);
        System.out.println("double: "+doubleValue);
        System.out.println("char: "+charValue);
        System.out.println("boolean: "+booleanValue);

        System.out.println("\n Non-Primitive Data Types:");
        System.out.println("String: "+stringValue);
        System.out.print("Array: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
    }
}