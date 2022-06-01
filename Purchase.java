import java.text.DecimalFormat;
import java.util.*;
public class Purchase 
{
    private ArrayList<Object> items;
    public Purchase()
    {
        this.items = new ArrayList<Object>();
    }
    public ArrayList getCart()
    {
        return this.items;
    }
    public void addItem(Object obj)
    {
        this.items.add(obj);
    }
    public Object getItem(int ind)
    {
        return this.items.get(ind);
    }
    public void removeItem(int ind)
    {
        this.items.remove(ind);
    }
    public String toString() 
    {
        String str = new String();
        for (int i = 0; i < items.size(); i++)
        {
            str += items.get(i) + "\n";
        }
        return str;
    }
    
}