import java.util.*;
import javax.swing.*;
import java.awt.*;
public class Cinema_Client 
{
    //public static int userSelect;
    public static Cinema cineplex = new Cinema();
    public static Purchase items = new Purchase();
    public static void main(String args[])
    {
        int userSelection;
        int price;
        Movie hel = new Movie(1,1,1,"fart");
        cineplex.addMovie(hel);
        cineplex.addMovie(new Movie(45,6,10.99,"batman"));
        //Object a = dropDownMenu(cineplex.getMovies());
        //System.out.println(a);
        userSelection = mainMenu(); 
        if (userSelection == 0)
        {
            movieSelect();
        }
        else if (userSelection == 1)
        {
            
        }
        else
        {
            
        }    

        
    }
    public static double movieSelect()
    {
        String[] menuOption = {"Adult Ticket", "Child Ticket", "Cancel"};


        String[] arr = new String[cineplex.getMovies().size()];
        Movie a;
        Movie mov;
        
        for (int i = 0; i < cineplex.getMovies().size();i++)
        {
            a = cineplex.getMovies().get(i);
            arr[i] = a.getTitle();
        }
        
        Object selection = JOptionPane.showInputDialog(null, "choose type", "selection", JOptionPane.QUESTION_MESSAGE, null, arr, arr[0]);

        int b = JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), "hello", "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[1]);

        for (int i = 0; i < cineplex.getMovies().size(); i++)
        {
            if (selection.equals(arr[i]))
            {
                mov = cineplex.getMovies().get(i);
                if (b == 0)
                {
                    return cineplex.getMovies().get(i).getCost();
                }
                else if (b == 0)
                {
                    return cineplex.getMovies().get(i).getChildCost();
                }
                else
                {
                    return -1;
                }
            }
        }


        
        //int b = JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), "hello", "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[1]);

        if (b == 0)
        {
            
        }

        return 0;
    }
    public static int mainMenu()
    {
        String[] menuOption = {"Purchase Movie Tickets", "Add Money", "exit"}; 
        return JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), "hello", "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[1]);    
    }
    public static double purchaseMovie()
    {
         

        
        Movie mov;

        return 0;
    }
}