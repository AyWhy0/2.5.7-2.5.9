// Alessandra Yu
/*
 * Activity 2.5.7
 *
 * A Book class for the MediaLibrary program
 */
public class Book
{
  private String title;
  private String author;
  private int rating;
  
  /*** Constructor ****/
  public Book(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;

    // 2.5.9 Step 6 - 11/13/2023
    // System.out.println("Adding book " + t);
  }
  
  // 2.5.9 Step 1 - 11/13/2023
  // public String getInfo()
  // {
  //   return "The current book information is " + info;
  // }

  // 2.5.7 Step 24 - 11/09/2023
  public boolean equals(Book b) {
    // 2.5.7 Step 26 & 29 - 11/09/2023
    if (b.author.equals(this.author) && b.title.equals(this.title)) {
      return true;
    } else {
      return false;
    }

    // 2.5.9 Step 8 - 11/13/2023
    // System.out.println("Checking book " + t);
  }

   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", written by " + author;
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

  public void setAuthor(String a) {
    author = a;
  }

  // 2.5.7 Step 7 - 11/09/2023
  public void adjustRating(int r) {
    // 2.5.7 Step 10 - 11/09/2023
    if ((rating + r) <= 10 && (rating + r) >= 0)
      rating += r;

    // 2.5.9 Step 10 - 11/13/2023
    System.out.println("Adjusting rating by " + r);
  }
}
