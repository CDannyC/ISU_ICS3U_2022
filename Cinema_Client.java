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
                movieInfo();
            }
            else if (userSelection == 2)
            {
                foodSelect();
            }
            else if (userSelection == 3)
            {
                addMoney();
            }
            else if (userSelection == 4)
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
        {return -1;}
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

        return 0;
    }//end movieSelect()


//////////////////////////////////////////////////////////////////////////////////////////


    public static int foodSelect()
    {
        String[] menuOption = {"Regular", "Large"};


        String[] arr = new String[cineplex.getFood().size()];
        Food a;
        Food mov;

        
        for (int i = 0; i < cineplex.getFood().size(); i++)
        {
            a = cineplex.getFood().get(i);
            arr[i] = cineplex.getFood().get(i).getFood();
        }//end loop
        
        Object selection = JOptionPane.showInputDialog(null, "choose type", "selection", JOptionPane.QUESTION_MESSAGE, null, arr, arr[0]);
        System.out.println(selection);
        System.out.println(selection == null);
        if (selection == null)
        {return -1;}
        //if (selection.equals())

        int b = JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), "hello", "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[1]);

        for (int i = 0; i < cineplex.getFood().size(); i++)
        {
            if (selection.equals(arr[i]))
            {
                mov = cineplex.getFood().get(i);
                if (b == 0)
                {
                    if (JOptionPane.showConfirmDialog(null, "Add adult ticket for " + df.format(cineplex.getFood().get(i).getPrice()) + " to see " + arr[i], "Add Item", JOptionPane.YES_NO_OPTION) == 0)
                    {
                        cineplex.getItems().addItem(cineplex.getFood().get(i));   
                    }
                }
                else if (b == 1)
                {
                    if (JOptionPane.showConfirmDialog(null, "Add child ticket for " + df.format(cineplex.getMovies().get(i).getChildCost()) + " to see " + arr[i], "Add Item", JOptionPane.YES_NO_OPTION) == 0)
                    {
                        cineplex.getItems().addItem(cineplex.getFood().get(i));
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


////////////////////////////////////////////////////////////////////////////////////////////////

    public static int movieInfo()
    {
        String[] arr = new String[cineplex.getMovies().size()];
        
        for (int i = 0; i < cineplex.getMovies().size(); i++)
        {
            arr[i] = cineplex.getMovies().get(i).getTitle();
        }//end loop

        Object selection = JOptionPane.showInputDialog(null, "choose type", "selection", JOptionPane.QUESTION_MESSAGE, null, arr, arr[0]);

        if (selection == null)
        {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) 
        {
            if (selection.toString() == arr[i])
            {
                JOptionPane.showConfirmDialog(null, cineplex.getMovies().get(i), "Movie Details", JOptionPane.OK_OPTION);
            }
        }

        return 0;
    }

    public static int addMoney()
    {
        Integer[] vals = {5, 10 , 25, 50, 100};
        Object selection = JOptionPane.showInputDialog(null, "Select amount of money to add to your balance", "Balance", JOptionPane.QUESTION_MESSAGE, null, vals, vals[0]);
        if (selection == null) 
            {return -1;}
        balance += (int)selection;
        JOptionPane.showMessageDialog(null, "Your current balance is: $" + df.format(balance), "Balance", JOptionPane.PLAIN_MESSAGE);
        return 0;
    }//end addMoney()

    public static int viewCart()
    {
        int selection;
        String str;
        boolean isChecked;
        Object[] arr = new Object[cineplex.getItems().getCart().size()];
        String[] menuOption = {"Void Item", "Proceed to Checkout",  "Go Back"};
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
                JOptionPane.showMessageDialog(null, "No items to void", " ERROR!", JOptionPane.OK_OPTION);
                return -1;
            }
        }
        else if (selection == 1) 
        {
            checkout();
        }
        return 0;
    }

    public static int mainMenu()
    {
        //Math.round(a * 100.0) / 100.0;
        String[] txt = {"Welcome To Cineplex", " ", "Current balance: $" +df.format(balance)};
        String[] menuOption = {"Purchase Movie Tickets", "View Movie Details", "Purchase Food", "Add Money", "View Cart", "exit"}; 
        return JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), txt, "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[0]);    
    }//end mainMenu()
    public static int checkout()
    {
        double total = 0;
        //Class a = new String("hh");
        for (int i = 0; i < cineplex.getItems().getCart().size(); i++) 
        {
            //if (cineplex.getItems().getItem(i).getClass().getName().equals("Ticket"))
            
            try
            {
                total += ((Ticket) cineplex.getItems().getItem(i)).getPrice();
            } catch (ClassCastException e)
            {
                total += ((Food) cineplex.getItems().getItem(i)).getPrice();
            }
            //total += ((String) cineplex.getItems().getItem(i)).length();   WILL GIVE ERROR BECAUSE CANNOT CAST TICKET TO STRING
                        
        }
        System.out.println(total);
        System.out.println(total);
        System.out.println(total);
        System.out.println(total);
        total = Math.round(total * 100.0) / 100.0;
        if (JOptionPane.showConfirmDialog(null, cineplex.getItems().toString() + "total: $" + total, "Your Cart",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null) == 0)

        {



            if (balance >= total)
            {
                balance -= total;
                cineplex.getItems().clearCart();
            }
            else
            {
                JOptionPane.showConfirmDialog(null, "Insufficient Funds!", "TBD", JOptionPane.OK_OPTION);
                return -1;
            }

        }
        return 0;
    }

}//end class
