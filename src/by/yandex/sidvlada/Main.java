package by.yandex.sidvlada;

public class Main {

    public static void main(String[] args)
    {
        Cashbox[] cashbox = {new Cashbox("касса №1"), new Cashbox("касса №2"), new Cashbox("касса №3")};
        String[] goods = {"goods 1", "goods 2", "goods 3"};
        for (int i = 1; i < 5; i++)
            new Client("Покупатель " + i, cashbox, goods);
    }
}
