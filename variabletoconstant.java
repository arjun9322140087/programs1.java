class ConstantExample {
    public static void main(String[] args) {
       
        int variable = 10;
        System.out.println("Original Variable: " + variable);

       
        final int CONSTANT = variable; 
        System.out.println("Constant Value: " + CONSTANT);


        System.out.println("Constant Value after trying to change: " + CONSTANT);
    }
}