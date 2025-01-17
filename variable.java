class VariableExample {

    int instanceVariable;

    static int staticVariable;


    public VariableExample(int value) {
        this.instanceVariable = value;
    }

  
    public void display() {
 
        int localVariable = 5;
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
    }

    public static void incrementStaticVariable() {
        staticVariable++;
    }

    public static void main(String[] args) {

        VariableExample obj1 = new VariableExample(10);
        VariableExample obj2 = new VariableExample(20);


        VariableExample.incrementStaticVariable();


        System.out.println("Object 1:");
        obj1.display();
        
        System.out.println("\nObject 2:");
        obj2.display();


        System.out.println("\nStatic Variable accessed from Object 1: " + obj1.staticVariable);
        System.out.println("Static Variable accessed from Object 2: " + obj2.staticVariable);
    }
}