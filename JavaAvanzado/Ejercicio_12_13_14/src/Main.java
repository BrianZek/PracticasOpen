/*
 * Copyright (c) 2023 Brian Salvador Javier Calderon
 */
public class Main {
    public static void main(String[] args) {
        UserManager users = new UserManager();
        System.out.println(users.create());
        System.out.println(users.read());
        System.out.println(users.update());
        System.out.println(users.erase());
        Temperatures temperature = new Temperatures();
        double celcius = 32;
        System.out.println(temperature.celciusToFahrenheit(celcius));
        System.out.println(temperature.celciusToKelvin(celcius));
    }
}


