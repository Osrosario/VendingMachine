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

    //Sets the intial amount of money
    public void setWallet(Integer amount)
    {
        wallet = wallet - amount;
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

    public void addItem(Item item)
    {
        //code
    }

    public List<Item> getItems()
    {
        return itemList;
    }
}
