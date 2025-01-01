import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        LocalDate myDate = LocalDate.now();

        System.out.println("enter your movie:");
        String newMovie = reading.nextLine();
        System.out.println("Welcome");

        int movieAge = 2022;
        double noteOne = 8.1;
        double noteTwo = 4.7;
        double noteThree = 6.0;

        int classificationMovie = (int) ((noteOne + noteTwo + noteThree) /3);

        System.out.println("Movie: " + newMovie + "came out at the cinema in " +movieAge);
        System.out.println("Movie: Avatar, critic's note " +classificationMovie);
        System.out.println(myDate);
        System.out.println();
    }
}