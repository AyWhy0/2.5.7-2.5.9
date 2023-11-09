/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  // 2.5.7 Step 31 - 11/09/2023
  private Movie movie;

  public void addBook(Book b)
  {
    book = b;
  }

  // 2.5.7 Step 31 - 11/09/2023
  public void addMovie(Movie m)
  {
    movie = m;
  }

  public String toString() 
  {
    // 2.5.7 Step 5 & 31 - 11/09/2023
    String info = book.toString() + "; " + movie.toString();
    
    return info;
  }

  // 2.5.7 Step 22 - 11/09/2023
  // 2.5.7 Step 18 - 11/09/2023
  // void testBook(Book tester) {
  //   // 2.5.7 Step 19 - 11/09/2023
  //   tester.setTitle("Testing...");
  //   System.out.println(tester.getTitle());
  // }
}