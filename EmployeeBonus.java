public class EmployeeBonus {
    public static void main(String[] args) {
        double salary = 30000;
        int years = 6;

        double bonus;

        if(years > 5) {
            bonus = salary * 0.10;
        } else {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus for employee: " + bonus);
    }
}