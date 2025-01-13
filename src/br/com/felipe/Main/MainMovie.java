package br.com.felipe.Main;

import br.com.felipe.Model.Movie;

import java.util.Scanner;

public class MainMovie {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        Movie movie = new Movie();

        movie.setFirstName("Avatar");
        movie.setAge(2022);
        movie.setTypPlan(true);

        if (movie.isTypPlan()){
            System.out.println(movie.getFirstName());
        }else {
            System.out.println("erro:");
        }
    }
}
