import javax.swing.*;
import java.text.DecimalFormat;

public class Cinema_Client 
{
    //public static int userSelect;
    public static DecimalFormat df = new DecimalFormat("#,###,##0.00");
    public static int ticketCounter;
    public static Cinema cineplex = new Cinema();
    public static double balance;
    public static void main(String args[])
    {
        int userSelection;
        Movie hel = new Movie(1,1,9.99,"fart");
        cineplex.addMovie(hel);
        cineplex.addMovie(new Movie(45,6,10.99,"batman"));
        //Object a = dropDownMenu(cineplex.getMovies());
        //System.out.println(a);
        while(true)
        {
        
            userSelection = mainMenu(); 
            if (userSelection == 0)
            {
                movieSelect();
            }
            else if (userSelection == 1)
            {
                addMoney();
            }
            else if (userSelection == 2)
            {
                viewCart();
            }
            else
            {
                System.exit(0);
            }
            System.out.println(cineplex.getItems());
        }//end loop

        
    }//end main
    public static void movieSelect()
    {
        String[] menuOption = {"Adult Ticket", "Child Ticket"};


        String[] arr = new String[cineplex.getMovies().size()];
        Movie a;
        Movie mov;

        
        for (int i = 0; i < cineplex.getMovies().size();i++)
        {
            a = cineplex.getMovies().get(i);
            arr[i] = a.getTitle();
        }//end loop
        
        Object selection = JOptionPane.showInputDialog(null, "choose type", "selection", JOptionPane.QUESTION_MESSAGE, null, arr, arr[0]);

        int b = JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), "hello", "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[1]);

        for (int i = 0; i < cineplex.getMovies().size(); i++)
        {
            if (selection.equals(arr[i]))
            {
                mov = cineplex.getMovies().get(i);
                if (b == 0)
                {
                    if (JOptionPane.showConfirmDialog(null, "Add adult ticket for " + df.format(cineplex.getMovies().get(i).getCost()) + " to see " + arr[i], "Add Item", JOptionPane.YES_NO_OPTION) == 0)
                    {
                        cineplex.getItems().addItem(new Ticket(cineplex.getMovies().get(i).getCost(), cineplex.getMovies().get(i)));
                    }
                }
                else if (b == 1)
                {
                    if (JOptionPane.showConfirmDialog(null, "Add child ticket for " + df.format(cineplex.getMovies().get(i).getChildCost()) + " to see " + arr[i], "Add Item", JOptionPane.YES_NO_OPTION) == 0)
                    {
                        cineplex.getItems().addItem(new Ticket(cineplex.getMovies().get(i).getChildCost(), cineplex.getMovies().get(i)));
                    }
                }
                else
                {
                    System.exit(0);
                }
            }//end if
        }//end loop
        

        
        //int b = JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), "hello", "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[1]);


    }//end movieSelect()

    public static void addMoney()
    {
        Integer[] vals = {5, 10 , 25, 50, 100};
        Object selection = JOptionPane.showInputDialog(null, "Select amount of money to add to your balance", "Balance", JOptionPane.QUESTION_MESSAGE, null, vals, vals[0]);
        balance += (int)selection;
        JOptionPane.showMessageDialog(null, "Your current balance is: $" + df.format(balance), "Balance", JOptionPane.PLAIN_MESSAGE);
    }//end addMoney()

    public static int viewCart()
    {
        int selection;
        Object[] arr = new Object[cineplex.getItems().getCart().size()];
        String[] menuOption = {"Void Item", "Go Back"};
        
        for (int i = 0; i < cineplex.getItems().getCart().size(); i++)
        {
            arr[i] = cineplex.getItems().getItem(i);
        }

        selection = JOptionPane.showOptionDialog(null, cineplex.getItems() , "Your Cart",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null, menuOption, menuOption[1]);
        if (selection == 0)
        {
            try
            {
                JOptionPane.showInputDialog(null, "Select item to void: ", "selection", JOptionPane.QUESTION_MESSAGE, null, arr, arr[0]);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                JOptionPane.showMessageDialog(null, "No items to void");
                return -1;
            }
        }
        return 0;
    }

    public static int mainMenu()
    {

        String[] menuOption = {"Purchase Movie Tickets", "Add Money", "View Cart", "exit"}; 
        return JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), "hello", "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[1]);    
    }//end mainMenu()
}//end class