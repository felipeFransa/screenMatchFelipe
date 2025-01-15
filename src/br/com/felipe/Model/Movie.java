package br.com.felipe.Model;

public class Movie {
    private String firstName;
    private int age;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isTypPlan() {
        return typPlan;
    }

    public void setTypPlan(boolean typPlan) {
        this.typPlan = typPlan;
    }

    private boolean typPlan;

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    private double note;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
