import java.util.Scanner;

public class VendingMachineApp 
{
    private static Scanner userInput = new Scanner(System.in);
    private static VendingMachine vendingMachine = new VendingMachine();

    public static String validateInt()
    {
        String input;
        
        while (true)
        {
            input = userInput.nextLine();
        
            try 
            {
                Integer.parseInt(input);
                break;
            } 
            catch (Exception e)
            {
                System.out.print("\nInvalid input. Please enter a whole number: ");
                continue;
            }
        }

        return input;
    }

    public static String validateString()
    {
        char[] inputChars;
        StringBuilder sb;

        while (true)
        {
            String input = userInput.nextLine();
            inputChars = input.toCharArray();
            sb = new StringBuilder();

            for (char c : inputChars)
            {
                if (Character.isAlphabetic(c))
                {
                    sb.append(c);
                }
                else
                {
                    System.out.print("\nInvalid input. Please enter only letters: ");
                    sb.delete(0, sb.length());
                    break;
                }
            }

            if (sb.toString().length() > 0)
            {
                break;
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) 
    {
        System.out.println("\nWelcome to the Victor's Vending Machine!");

        System.out.print("\nWhat is your name?: ");
        String name = validateString();

        System.out.print("\nHow much money do you have?: ");
        int amount = Integer.parseInt(validateInt());

        Vendee vendee = new Vendee(name, amount);

        System.out.print("\nPlease insert how much money you want to use?: ");
        int money = Integer.parseInt(validateInt());

        vendingMachine.insertMoney(vendee, money);        
        
        while (vendingMachine.getMoney() > 0)
        {
            vendingMachine.printItems();

            System.out.println("\nWhat would you like to purchase?");
            System.out.print("Please enter a number: ");
            int answer = Integer.parseInt(validateInt());

            if (answer - 1 > vendingMachine.getVendItems().size())
            {
                answer = vendingMachine.getVendItems().size();
            }

            vendingMachine.chooseItem(answer - 1);

            vendingMachine.printItems();
        
            System.out.println("\nWould you like to purchase something else?");
            System.out.print("Please enter 'y' or 'n': ");
            String answer2 = validateString();

            if (answer2.equals("n"))
            {
                vendee.addMoney(vendingMachine.getMoney());
                vendingMachine.setMoney(0);
            }        
        }
    }
}

