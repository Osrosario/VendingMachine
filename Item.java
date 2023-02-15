public class Item
{
    //initial variable(s)
    private String name;
    private int price;

    //Constructor
    public Item(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    //Returns the price of the item
    public String getName()
    {
        return name;
    }    
    
    //Returns the price of the item
    public int getPrice()
    {
        return price;
    }
}
