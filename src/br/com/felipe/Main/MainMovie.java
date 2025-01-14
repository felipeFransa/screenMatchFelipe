package br.com.felipe.Main;

import br.com.felipe.Model.Movie;

import java.util.Scanner;

public class MainMovie {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Enter your movie:");
        String readingMovie = reading.nextLine();
        Movie movie = new Movie();

        movie.setFirstName(readingMovie);
        movie.setAge(2022);
        movie.setTypPlan(true);

        if (movie.isTypPlan()){
            System.out.println(movie.getFirstName());
            System.out.println(movie.getAge());
        }else {
            System.out.println("erro:");
        }
    }
}
