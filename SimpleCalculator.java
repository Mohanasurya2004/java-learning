public class SimpleCalculator {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        char operator = '+';
        int result;
        switch (operator) {
            case '+':
                result = a+b;
                System.out.println("result is " + result);
                break;
                case '-':
                    result = a-b;
                    System.out.println( "result is " + result);
                    break;
                    case '*':
                        result = a*b;
                        System.out.println( "result is " + result);
                        break;
        }
    }
}
