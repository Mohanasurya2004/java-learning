public class TrafficLight {
    public static void main(String[] args) {
        String color = "green";

        if (color.equalsIgnoreCase("red")) {
            System.out.println("STOP!");

        }
        else if (color.equalsIgnoreCase("yellow")) {
            System.out.println("READY to move.");
        }
        else if (color.equalsIgnoreCase("green")) {
            System.out.println("GO!");
        }
        else {
            System.out.println("Invalid color input!");
        }
    }
}
