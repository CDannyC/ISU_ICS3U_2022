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
        Cinema cineplex = new Cinema();
        Purchase items = new Purchase();
        Movie hel = new Movie(1,1,1,1,"fart");
        cineplex.addMovie(hel);
        cineplex.addMovie(new Movie(45,6,5.99,10.99,"batman"));
        //Object a = dropDownMenu(cineplex.getMovies());
        //System.out.println(a);
        checkMainMenu(mainMenu());

        
    }
    public static Object dropDownMenu(ArrayList lst)
    {
        Object[] arr = lst.toArray();
        return JOptionPane.showInputDialog(null, "choose type", "selection", JOptionPane.QUESTION_MESSAGE, null, arr, arr[0]);
    }
    public static int mainMenu()
    {
        String[] menuOption = {"View Movies", "Add Money", "exit"}; 
        return 1 + JOptionPane.showOptionDialog(JOptionPane.getRootFrame(), "hello", "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuOption, menuOption[1]);    
    }
    public static void checkMainMenu(int op)
    {
        if (op == 1)
        {
            dropDownMenu(cineplex.getMovies());
        }
        else if (op == 2)
        {
            
        }
        else
        {
            
        }
    }
    
}
