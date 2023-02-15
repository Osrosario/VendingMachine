import java.util.Scanner;

public class VendingMachineApp 
{
    Scanner userInput = new Scanner(System.in);
    private static VendingMachine vendingMachine = new VendingMachine();

    //Function to fill the vending machine
    public static void fillMachine()
    {
        Item chips = new Item("chips", 2);
        Item soda = new Item( "soda", 1);
        Item water = new Item( "water", 1);

        vendingMachine.addItem(water);
        vendingMachine.addItem(soda);
        vendingMachine.addItem(chips);
    }
    
    public static void main(String[] args) 
    {
        fillMachine();
    }
}

