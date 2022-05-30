import java.util.*;
public class Cinema 
{
    private Purchase items;
    private ArrayList<Movie> movies;

    public Cinema() 
    {
        this.items = new Purchase();
        this.movies = new ArrayList<Movie>();
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