package ru.yandex.praktikum;

public class Praktikum {

    public static void main(String[] args) {

        for (String name : args) {
            Account account = new Account(name);
            System.out.println("Is name '" + name + "' correct? " + account.checkNameToEmboss());
        }
    }

}
