// 2.5.8 Step 26 - 11/11/2023
public class Song {
    private String title;
    private int rating;
    
    /*** Constructor ****/
    public Song (String t)
    {
        title = t;
        rating = 0;
    }
    
    // 2.5.7 Step 32 - 11/09/2023
    public boolean equals(Song s) {
        if (s.title.equals(this.title)) {
        return true;
        } else {
        return false;
        }
    }

    /*** Accessor methods ***/
    public String getTitle() {
        return title;
    }
    
    public int getRating() {
        return rating;
    }
    
    public String toString() 
    {
        String info = "\"" + title + "\"";
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

    public void adjustRating(int r) {
        if ((rating + r) <= 10 && (rating + r) >= 0)
        rating += r;
    }
}