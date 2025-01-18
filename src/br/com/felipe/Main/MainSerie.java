package br.com.felipe.Main;

import br.com.felipe.Model.Serie;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class MainSerie {
    public static void main(String[] args) {
        Serie serie = new Serie();
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        Scanner reading = new Scanner(System.in);
        System.out.println("Enter your serie: ");
        String serietitle = reading.nextLine();

        serie.setTitle(serietitle);
        serie.setAge(2003);
        serie.setTypePlan(true);
        serie.setSeasons(15);

        if (serie.isTypePlan()){
            System.out.println(serie.getTitle());
            System.out.println(serie.getAge());
            System.out.println(myDate);
            System.out.println(myTime);
        }else {
            System.out.println("erro:");
        }
    }
}
