public class operation {
    static void addition(int a,int b){
        System.out.println("addition of a and b :"+(a+b));
    }
    static void subtraction(int a,int b){
        System.out.println("subtraction of a and b :"+(a-b));
    }
    static void multiplication(int a,int b){
        System.out.println("multiplication of a and b :"+(a*b));
    }
    static void division(int a,int b){
        System.out.println("division of a and b :"+(a/b));
    }

    public static void main(String[] args) {
        addition(10,20);
        subtraction(12,26);
        multiplication(20,11);
        division(50,20);
    }
}
