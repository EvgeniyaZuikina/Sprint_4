package ru.yandex.praktikum;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return name != null &&
                name.length() >= 3 &&
                name.length() <= 19 &&
                name.length() - name.replace(" ", "").length() == 1 &&
                !name.startsWith(" ") &&
                !name.endsWith(" ");
    }
}