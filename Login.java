public class Login {
    public static void main(String[] args){
        String correctUsername = "admin";
        String correctPassword = "1121" ;

        String username = "admin";
        String password = "1121";

        if(username.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Invalid username or password");
        }
    }
}
