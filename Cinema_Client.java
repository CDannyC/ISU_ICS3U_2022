import java.util.*;
import javax.swing.*;
import java.awt.*;
public class Cinema_Client 
{
    public static void main(String args[])
    {
        Cinema cineplex = new Cinema();
        Movie hel = new Movie(1,1,1,1,"fart");
        cineplex.addMovie(hel);
        
    }
    public static Object dropDownMenu(Cinema cin)
    {
        String[] selections = new String[3];
        selections[0] = "Option1";
        selections[1] = "Option2";
        selections[2] = "Option3";
        ArrayList list = cin.getMovies();
        Object[] movs = list.toArray();

        return JOptionPane.showInputDialog(null, "choose type", "selection", JOptionPane.QUESTION_MESSAGE, null, movs, movs[0]);
    }
}
