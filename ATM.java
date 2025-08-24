public class ATM {
    public static void main(String[] args){
        int balance = 5000 ;
        int withdraw= 1500;
        if (withdraw<=balance && withdraw>0){
            balance -= withdraw;
            System.out.println("please collect your cash.");
            System.out.println("remaining balance: " + balance);
        }
        else if (withdraw<=0){
            System.out.println("Invalid amount!");
        }
        else{
            System.out.println("Insufficient balance!");
        }
    }
}
