package br.com.felipe.Main;

import br.com.felipe.Model.Movie;

public class MainMovie {
    public static void main(String[] args) {
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
