    class EvenNumbersInRange {
    public static void main(String[] args) {
        System.out.println("Even numbers between 3 and 100:");

       
        for (int i = 3; i <= 100; i++) {
          
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}