public class Movie 
{
    private int mins, hrs;
    private double childCost, adultCost;
    private String title;  

    public Movie(int mins, int hrs, double childCost, double adultCost, String title) {
        this.mins = mins;
        this.hrs = hrs;
        this.childCost = childCost;
        this.adultCost = adultCost;
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
        return childCost;
    }
    public void setChildCost(double childCost) {
        this.childCost = childCost;
    }
    public double getAdultCost() {
        return adultCost;
    }
    public void setAdultCost(double adultCost) {
        this.adultCost = adultCost;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
                this.title = title;
    }

    public String toString() {
        return "Movie [adultCost=" + adultCost + ", childCost=" + childCost + ", hrs=" + hrs + ", mins=" + mins
                + ", title=" + title + "]";
    }

    
}
