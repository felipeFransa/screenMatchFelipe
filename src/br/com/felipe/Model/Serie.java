package br.com.felipe.Model;

public class Serie {
    private String title;
    private int age;
    private int seasons;
    private boolean typePlan;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTypePlan() {
        return typePlan;
    }

    public void setTypePlan(boolean typePlan) {
        this.typePlan = typePlan;
    }
}
