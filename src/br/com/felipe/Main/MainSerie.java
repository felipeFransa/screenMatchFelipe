package br.com.felipe.Main;

import br.com.felipe.Model.Serie;

public class MainSerie {
    public static void main(String[] args) {
        Serie serie = new Serie();

        serie.setTitle("supernatural");
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
