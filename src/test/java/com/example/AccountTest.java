package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String nameInput;
    private final boolean expectedReturn;

    public AccountTest(String nameInput, boolean expectedReturn) {
        this.nameInput = nameInput;
        this.expectedReturn = expectedReturn;
    }

    @Parameterized.Parameters
    public static Object[][] getNameParameters() {
        return new Object[][]{
                {"Проверка Проверка", true}, //17 символов
                {"П П", true}, //3 символа
                {"Проверка Проверочка", true}, //19 символов
                {"Проверка Проверочная", false}, //20 символов
                {"ПП", false}, //2 символа
                {" Проверка Провер", false}, //пробел в начале
                {"Проверка Провер ", false}, //пробел в конце
                {" Провер Провер ", false}, //пробел в начале и конце
                {"ПроверкаПроверка", false}, //без пробела
                {"", false} //пустая
        };
    }

    @Test
    public void getCheckNameReturn() {
        Account account = new Account(nameInput);
        boolean actualReturn = account.checkNameToEmboss();
        Assert.assertEquals(expectedReturn, actualReturn);
    }
}
