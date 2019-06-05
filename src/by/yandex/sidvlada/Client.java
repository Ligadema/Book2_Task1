package by.yandex.sidvlada;

public class Client extends Thread {
    private Cashbox[] cashbox;
    String goods[];

    public Client(String name, Cashbox[] cashDesks, String[] goods)
    {
        super(name);
        this.cashbox = cashDesks;
        this.goods = goods;
        this.start();
    }

    public String[] getGoods()
    {
        return this.goods;
    }

    @Override
    public void run()
    {
        boolean flag = true;
        while (flag)
        {
            for (int i = 0; i < this.cashbox.length; i++)
            {
                System.out.println(this.cashbox[i].getGoods(this));
                if (this.isAlive())
                {
                    flag = false;
                    break;
                }
            }
        }
    }
}
