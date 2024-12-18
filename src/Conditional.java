import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);
        System.out.println("enter your type plan:");
        String typePlan = reading.nextLine();

        System.out.println("enter your age movie:");
        int yearOfRelease = reading.nextInt();

        boolean included = true;

        if (yearOfRelease >= 2018){
            System.out.println("launch");

            if (typePlan.equals("Plus")){
                System.out.println("welcome");
            }else {
                System.out.println("Access denied");
            }
        }else {
            System.out.println("Access denied");
        }
    }
}
