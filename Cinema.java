import java.util.*;
public class Cinema 
{
    private Purchase items;
    private ArrayList<Movie> movies;
    private ArrayList<Food> food;

    public Cinema() 
    {
        this.items = new Purchase();
        this.movies = new ArrayList<Movie>();
        this.food = new ArrayList<Food>();
        movies.add(new Movie(1,1,9.99,"hello"));
        movies.add(new Movie(45,6,10.99,"batman"));
        movies.add(new Movie(56, 1, 19.99, "Avengers"));
        food.add(new Food("Chips", 5.99));
    }



    public ArrayList<Food> getFood() 
    {
        return food;
    }

    public ArrayList<Movie> getMovies()
    {
        return movies;
    }
    public Purchase getItems()
     {
        return items;
    }
    public void setMovies(ArrayList<Movie> movies)
     {
        this.movies = movies;
    }
    
 
    public void removeMovie(Movie mov)
    {
        this.movies.remove(mov);
    }
    public void addMovie(Movie mov)
    {
        this.movies.add(mov);
    }
}