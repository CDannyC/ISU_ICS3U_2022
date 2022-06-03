public class Movie 
{
    private int mins, hrs;
    private double cost;
    private String title;  

    public Movie(int mins, int hrs, double cost, String title) {
        this.mins = mins;
        this.hrs = hrs;
        this.cost = cost;
        this.title = title;
    }

    public int getMins() {
        return mins;
    }
    public void setMins(int mins) {
        this.mins = mins;
    }
    public int getHrs() {
        return hrs;
    }
    public void setHrs(int hrs) {
        this.hrs = hrs;
    }
    public double getChildCost() {
        double a = cost * .7;
        return Math.round(a * 100.0) / 100.0;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
                this.title = title;
    }

    public String toString() {
        return "Movie [cost=" + cost + ", childCost=" + this.getChildCost() + ", hrs=" + hrs + ", mins=" + mins
                + ", title=" + title + "]";
    }

}