    class VariableAccessExample {
    
    int globalVariable = 10;

    public void methodWithLocalVariable() {
       
        int localVariable = 5;

                System.out.println("Inside methodWithLocalVariable:");
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Global Variable: " + globalVariable);
    }

    public void anotherMethod() {
      

        
        System.out.println("Inside anotherMethod:");
        System.out.println("Global Variable: " + globalVariable);
    }

    public static void main(String[] args) {
        VariableAccessExample example = new VariableAccessExample();
        example.methodWithLocalVariable();
        example.anotherMethod();
    }
}