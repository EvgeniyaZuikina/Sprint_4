package ru.yandex.praktikum;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expected;

    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] dataForTest() {
        return new Object[][]{
                {null, false},
                {"", false},
                {"Evgeniya ", false},
                {" Evgeniya", false},
                {"Evgeniya  Zuykina", false},
                {"EvgeniyaZuykina", false},
                {"EZ", false},
                {"Evgeniya Zuykinaalexandrovna", false},
                {"Evgeniya Zuykinaalex", false},
                {"Evgeniya Zuykina", true},
                {"Ev Z", true},
                {"E Z", true},
                {"Evgeniya Zuykinaale", true},
                {"Evgeniya Zuykinaal", true},
        };
    }

    @Test
    @DisplayName("checkNameToEmboss method")
    @Description("check checkNameToEmboss method the method return true or false")
    public void checkNameToEmbossTest() {
        Account account = new Account(name);

        boolean result = account.checkNameToEmboss();

        assertEquals(result, expected);
    }
}