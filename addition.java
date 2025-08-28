public class addition {
    static void add(int a, int b ,int c){
        System.out.println("addition of a,b,c :"  + (a+b+c));
    }
    static void sub(int a, int b,int c){
        System.out.println("subtraction of a,b,c :"  + (a-b-c));
    }
    static void multi(int a,int b,int c){
        System.out.println("multiplication of a,b,c :"  + (a*b*c));
    }
    static void div(int a,int b,int c){
        System.out.println("division of a,b,c :"  + (a/b/c));
    }
     public static void main(String[] args) {
        add(10,20,30);
        sub(10,20,30);
        multi(10,20,30);
        div(10,20,30);
     }
}
