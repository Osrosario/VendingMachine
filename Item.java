public class Item
{
    //initial variable(s)
    private String name;
    private Integer price;

    //Constructor
    public Item(String name, Integer price)
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
    public Integer getPrice()
    {
        return price;
    }
}
