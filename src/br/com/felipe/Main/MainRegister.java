package br.com.felipe.Main;

import br.com.felipe.Model.Client;

public class MainRegister {
    public static void main(String[] args) {
        Client registerClient = new Client();

        registerClient.setFirstName("");
        registerClient.setAge(27);
        registerClient.setCity("");

        System.out.println(registerClient.getFirstName());
        System.out.println(registerClient.getAge());
        System.out.println(registerClient.getCity());
    }
}
