package by.yandex.sidvlada;

public class Cashbox {
    private String cashboxName;

    public Cashbox(String cashboxName)
    {
        this.cashboxName = cashboxName;
    }

    public String getcashboxName()
    {
        return this.cashboxName;
    }

    public synchronized String getGoods(Client client)
    {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < client.getGoods().length; i++)
            if (i != client.getGoods().length - 1)
                result.append(client.getGoods()[i] + ", ");
            else
                result.append(client.getGoods()[i]);
        return "Покупатель " + client.getName() + " купил: " + result + " в " + this.getcashboxName();
    }
}
