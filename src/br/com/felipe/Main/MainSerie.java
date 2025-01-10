package br.com.felipe.Main;

import br.com.felipe.Model.Serie;

import java.util.Scanner;

public class MainSerie {
    public static void main(String[] args) {
        Serie serie = new Serie();
        Scanner reading = new Scanner(System.in);
        System.out.println("Enter your serie: ");
        String serietitle = reading.nextLine();

        serie.setTitle(serietitle);
        serie.setAge(2003);
        serie.setTypePlan(true);
        serie.setSeasons(15);

        if (serie.isTypePlan()){
            System.out.println(serie.getTitle());
        }else {
            System.out.println("erro:");
        }
    }
}
