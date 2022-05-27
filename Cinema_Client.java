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
    public static Object movieSelect()
    {
        String[] arr = new String[cineplex.getMovies().size()];
        Movie a;
        for (int i = 0; i < cineplex.getMovies().size();i++)
        {
            a = cineplex.getMovies().get(i);
            arr[i] = a.getTitle();
        }
        return JOptionPane.showInputDialog(null, "choose type", "selection", JOptionPane.QUESTION_MESSAGE, null, arr, arr[0]);
    }
    public static int mainMenu()
    {
        String[] menuOption = {"Purchase Movie Tickets", "Add Money", "exit"}; 
        return JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), "hello", "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[1]);    
    }    
}
