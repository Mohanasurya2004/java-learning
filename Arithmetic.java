public class Arithmetic {
    static void addition(){
        int a=10,b=20;
        System.out.println("addition:"+(a+b));
    }
    static void subtract(){
        int a=20,b=40;
        System.out.println("subraction:"+(a-b));
    }
    static void multiply(){
        int a=15,b=20;
        System.out.println("multiply:"+(a*b));
    }
    static void divide(){
        int a=50,b=25;
        System.out.println("divide:"+(a/b));
    }

    public static void main(String[] args) {
        addition();
        subtract();
        multiply();
        divide();
    }
}
