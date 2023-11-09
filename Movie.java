// 2.5.7 Step 30 - 11/09/2023
public class Movie {
    private String title;
    private double duration;
    private int rating;
    
    /*** Constructor ****/
    public Movie(String t, double d)
    {
        title = t;
        duration = d;
        rating = 0;
    }
    
    // 2.5.7 Step 32 - 11/09/2023
    public boolean equals(Movie m) {
        if (m.duration == this.duration && m.title.equals(this.title)) {
        return true;
        } else {
        return false;
        }
    }

    /*** Accessor methods ***/
    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }
    
    public int getRating() {
        return rating;
    }
    
    public String toString() 
    {
        String info = "\"" + title + "\" is " + duration + " hours long.";
        if (rating != 0) 
        { 
        info += ", rating is " + rating;
        }
        return info;
    }

    /*** Mutator methods ***/
    public void setTitle(String t) {
        title = t;
    }

    public void setDuration(double d) {
        duration = d;
    }

    public void adjustRating(int r) {
        if ((rating + r) <= 10 && (rating + r) >= 0)
        rating += r;
    }
}
