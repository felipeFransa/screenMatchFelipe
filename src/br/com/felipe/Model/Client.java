package br.com.felipe.Model;

public class Client {
    private String firstName;
    private Integer age;
    private String city;
    private Boolean typePlan;

    public Boolean getTypePlan() {
        return typePlan;
    }

    public void setTypePlan(Boolean typePlan) {
        this.typePlan = typePlan;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
