import java.util.*;
public class Purchase 
{
    private ArrayList<Object> items;

    public Purchase()
    {
        this.items = new ArrayList<Object>();
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
}
