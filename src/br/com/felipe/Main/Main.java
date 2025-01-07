package br.com.felipe.Main;

import br.com.felipe.Model.Movie;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        LocalDate myDate = LocalDate.now();
        Movie movie = new Movie();

        System.out.println("enter your movie:");
        String newMovie = reading.nextLine();
        System.out.println("Welcome");

        movie.setFirstName(newMovie);
        movie.setAge(2022);
        movie.setNote(8.2);

        double noteOne = movie.getNote();
        double noteTwo = 4.7;
        double noteThree = 6.0;

        int classificationMovie = (int) ((noteOne + noteTwo + noteThree) /3);

        System.out.println("Movie: " + newMovie + "came out at the cinema in " +movie.getFirstName());
        System.out.println("Movie: Avatar, critic's note " +classificationMovie);
        System.out.println(movie.getAge());
        System.out.println(myDate);
    }
}