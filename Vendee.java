import java.util.*;

public class Vendee 
{
    //Initial variable(s)
    private String name;
    private int wallet;
    private List<Item> itemList;

    //Constructor
    public Vendee(String name, int wallet)
    {
        this.name = name;
        this.wallet = wallet;
        itemList = new ArrayList<Item>();
    }

    //Adds money to wallet
    public void addMoney(Integer amount)
    {
        wallet += amount;
    }

    //Subtracts money from wallet
    public void removeMoney(Integer amount)
    {
        wallet -= amount;
    }

    //Returns the amount of money
    public int getWallet()
    {
        return wallet;
    }

    public String getName()
    {
        return name;
    }
}
