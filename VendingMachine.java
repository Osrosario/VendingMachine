import java.util.*;

public class VendingMachine 
{
    private static Scanner userInput = new Scanner(System.in);
    private List<Item> itemList = new ArrayList<Item>();
    private int money;
    
    public void addItem(Item item)
    {
        itemList.add(item);
    }

    public Item getItem(int index)
    {
        return itemList.get(index);
    }

    public List<Item> getItems()
    {
        return itemList;
    }

    //Sets the initial amount of money entered into machine
    public void insertMoney(Vendee vendee, int amount)
    {
        while (amount > vendee.getWallet())
        {
            System.out.print("\nYou don't have that much money. Please insert a valid amount: ");
            amount = userInput.nextInt();
        }

        while (amount % 1 != 0)
        {
            System.out.print("\nWe only except $1 bills. Please insert a valid amount: ");
            amount = userInput.nextInt();
        }

        vendee.setWallet(amount);
        setMoney(amount);

        System.out.println("You've inserted " + amount + " dollars.");
    }

    //Sets the amount of money when item is purchased
    public void setMoney(int amount)
    {
        //code
    }

    //Returns item bought
    public Item vendItem(Item item)
    {
        return item;
    }

    //Returns change
    public int returnChange()
    {
        return 0;
    }
}


