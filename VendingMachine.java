import java.util.*;

public class VendingMachine 
{
    private static Scanner userInput = new Scanner(System.in);
    private List<Item> vendItems = new ArrayList<Item>();
    private List<Item> itemsToBuy = new ArrayList<Item>();
    private int money;
    
    public VendingMachine()
    {
        Item chips = new Item("Chips", 2);
        Item soda = new Item( "Cola", 1);
        Item water = new Item( "Water", 1);

        vendItems.add(water);
        vendItems.add(soda);
        vendItems.add(chips);
    }

    //Sets the initial amount of money entered into machine
    public void insertMoney(Vendee vendee, int amount)
    {
        while (amount > vendee.getWallet())
        {
            System.out.print("\nYou don't have that much money. Please insert a valid amount: ");
            amount = userInput.nextInt();
        }

        while (amount % 1 != 0 || amount < 0)
        {
            System.out.print("\nWe only except $1 bills. Please insert a valid amount: ");
            amount = userInput.nextInt();
        }

        vendee.removeMoney(amount);
        money = amount;

        System.out.println("You've inserted " + amount + " dollars.");
    }

    public List<Item> getVendItems()
    {
        return vendItems;
    }

    public void chooseItem(int index)
    {
        itemsToBuy.add(vendItems.get(index));
        removeMoney(vendItems.get(index).getPrice());
        vendItems.remove(index);
    }

    public List<Item> itemsToBuy()
    {
        return itemsToBuy;
    }

    public void setMoney(int amount)
    {
        money = amount;
    }

    public void removeMoney(int amount)
    {
        money -= amount;
    }

    public int getMoney()
    {
        return money;
    }

    //Returns change
    public int returnChange()
    {
        return 0;
    }

    public void printItems()
    {
        System.out.println("\nMoney Left: $" + money);
        System.out.println("\nAvailable Items:");
        for (int i = 0; i < vendItems.size(); i++)
        {
            System.out.println((i + 1) + ". " + vendItems.get(i).getName() + " - $" + vendItems.get(i).getPrice());
        }

        System.out.println("\nSelected:");
        for (int i = 0; i < itemsToBuy.size(); i++)
        {
            System.out.println(itemsToBuy.get(i).getName() + " - $" + itemsToBuy.get(i).getPrice());
        }
    } 
}


