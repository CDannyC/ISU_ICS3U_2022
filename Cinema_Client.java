import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Cinema_Client 
{
    //public static int userSelect;
    public static DecimalFormat df = new DecimalFormat("#,###,##0.00");
    public static int ticketCounter;
    public static Cinema cineplex = new Cinema();
    public static double balance = 100;
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
    public static int movieSelect()
    {
        String[] menuOption = {"Adult Ticket", "Child Ticket"};


        String[] arr = new String[cineplex.getMovies().size()];
        Movie a;
        Movie mov;

        
        for (int i = 0; i < cineplex.getMovies().size(); i++)
        {
            a = cineplex.getMovies().get(i);
            arr[i] = a.getTitle();
        }//end loop
        
        Object selection = JOptionPane.showInputDialog(null, "choose type", "selection", JOptionPane.QUESTION_MESSAGE, null, arr, arr[0]);
        System.out.println(selection);
        System.out.println(selection == null);
        if (selection == null)
        { return -1;}
        //if (selection.equals())

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
                        if (balance >= cineplex.getMovies().get(i).getCost())
                        {
                            balance -= cineplex.getMovies().get(i).getCost();
                            cineplex.getItems().addItem(new Ticket(cineplex.getMovies().get(i).getCost(), cineplex.getMovies().get(i)));
                        }
                        else
                        {
                            JOptionPane.showConfirmDialog(null, "Insufficient Funds!", "TBD", JOptionPane.OK_OPTION);
                            return -1;
                        }
                    }
                }
                else if (b == 1)
                {
                    if (JOptionPane.showConfirmDialog(null, "Add child ticket for " + df.format(cineplex.getMovies().get(i).getChildCost()) + " to see " + arr[i], "Add Item", JOptionPane.YES_NO_OPTION) == 0)
                    {
                        if (balance >= cineplex.getMovies().get(i).getChildCost())
                        {
                            balance -= cineplex.getMovies().get(i).getChildCost();
                            cineplex.getItems().addItem(new Ticket(cineplex.getMovies().get(i).getChildCost(), cineplex.getMovies().get(i)));
                        }
                        else
                        {
                            JOptionPane.showConfirmDialog(null, "Insufficient Funds!", "TBD", JOptionPane.OK_OPTION);
                            return -1;
                        }

                    }
                }
                else
                {
                    System.exit(0);
                }
            }//end if
        }//end loop
        

        
        //int b = JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), "hello", "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[1]);

        return 0;
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
        String str;
        boolean isChecked;
        Object[] arr = new Object[cineplex.getItems().getCart().size()];
        String[] menuOption = {"Void Item", "Go Back"};
        JCheckBox[] checkB = new JCheckBox[cineplex.getItems().getCart().size()];
        ArrayList<Integer> rmv = new ArrayList<Integer>();
        
        for (int i = 0; i < cineplex.getItems().getCart().size(); i++)
        {
            checkB[i] = new JCheckBox(cineplex.getItems().getItem(i).toString());
            arr[i] = cineplex.getItems().getItem(i);
        }

        selection = JOptionPane.showOptionDialog(null, cineplex.getItems() , "Your Cart",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null, menuOption, menuOption[1]);
        if (selection == 0)
        {

            try
            {
                if (checkB[0].equals(null))
                {}
                //System.out.println(JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(), checkB, "Select the items you would like to void", JOptionPane.OK_CANCEL_OPTION));
                if (JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(), checkB, "Select the items you would like to void", JOptionPane.OK_CANCEL_OPTION) == 0)
                {

                    System.out.println(checkB.length);
                    System.out.println(cineplex.getItems().getCart().size());
                    //System.out.println(cineplex.getItems().getItem(i));
                    System.out.println();
                    for (int i = 0; i < checkB.length; i++) 
                    {   
                        System.out.println(cineplex.getItems().getItem(i));
                        if (checkB[i].isSelected() == true)
                        {
                            rmv.add(i);
                        }
                        System.out.println(i);
                    }
                    for (int i = rmv.size()-1; i>=0; i--) 
                    {
                        cineplex.getItems().removeItem(rmv.get(i));
                    }
                }
                return 1;
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
        //Math.round(a * 100.0) / 100.0;
        String[] txt = {"Welcome To Cineplex", " ", "Current balance: $" +df.format(balance)};
        String[] menuOption = {"Purchase Movie Tickets", "Add Money", "View Cart", "exit"}; 
        return JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), txt, "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[0]);    
    }//end mainMenu()
}//end class