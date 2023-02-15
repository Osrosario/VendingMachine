import java.util.Scanner;

public class VendingMachineApp 
{
    private static Scanner userInput = new Scanner(System.in);
    private static String answer;
    private static String answer2;
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
    public static void validate(int input)
    {
        while (true)
        {
            try 
            {
                input = userInput.nextInt();
            } 
            catch (Exception e)
            {
                System.out.println("Invalid input. Choose another value");
            }
            finally
            {

            }


        }
    }
    
    public static void main(String[] args) 
    {
        fillMachine();
        Vendee vendee = new Vendee("Sean", 5);

        System.out.println("\nWelcome to the Victor's Vending Machine!");
        System.out.print("\nPlease insert the money you wish to use: ");

        int money = userInput.nextInt();
        vendingMachine.insertMoney(vendee, money);

        while (vendingMachine.getMoney() <= 0 || answer2 != "y")
        {
            vendingMachine.printItems();
            System.out.print("\nWhat would you like to purchase?: ");
            int answer = userInput.nextInt();

            vendee.addItem(vendingMachine.vendItem(answer - 1));
        
            vendee.getItems().size();
            System.out.println("Are you sure you want to make a purchase?");
            System.out.println("Please enter y / n ");
            String answer2 = userInput.nextLine();
    

        
        }

    }
}

