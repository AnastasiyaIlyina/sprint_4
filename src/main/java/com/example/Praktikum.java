package com.example;

public class Praktikum {
    public static void main(String[] args) {
       String name = "Проверка Проверка";
       Account account = new Account(name);
       boolean checkNameAnswer = account.checkNameToEmboss();
       System.out.println(checkNameAnswer);
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
    }
}
