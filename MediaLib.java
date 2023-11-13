// Alessandra Yu
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
  // 2.5.8 Step 5 & 9 - 11/11/2023
  public static String owner = "Owner";
  // 2.5.8 Step 12 - 11/11/2023
  private static int numEntries;
  // 2.5.8 Step 27 - 11/11/2023
  private Song song;
  // 2.5.8 Step 29 - 11/11/2023
  private static int numBookEntries;
  private static int numMovieEntries;
  private static int numSongEntries;
  // 2.5.9 Step 22 - 11/13/2023
  private String dateStarted;
  private String dateUpdated;

  public MediaLib() {
    dateStarted = DateAndTime.getDateTime();
    dateUpdated = dateStarted;
  }

  // 2.5.8 Step 2 - 11/11/2023
  public static String getOwner() {
    // 2.5.8 Step 6 - 11/11/2023
    return owner;
  }

  // 2.5.8 Step 13 - 11/11/2023
  public static int getNumEntries() {
    // 2.5.8 Step 18 - 11/11/2023
    // System.out.println("Test: Owner is " + owner);
    // 2.5.8 Step 19 - 11/11/2023
    // System.out.println("Test: Book is " + book);

    return numEntries;
  } 

  public void addBook(Book b)
  {
    // 2.5.8 Step 23 - 11/11/2023
    if (book == null) {
      book = b;
      // 2.5.8 Step 15 - 11/11/2023
      numEntries += 1;
      numBookEntries += 1;
      dateUpdated = DateAndTime.getDateTime(); // 2.5.9 Step 22 - 11/13/2023
    } else {
      // 2.5.8 Step 24 - 11/11/2023
      System.out.println("One book is already in the library :(");
    }
  }

  // 2.5.7 Step 31 - 11/09/2023
  public void addMovie(Movie m)
  {
    // 2.5.8 Step 23 - 11/11/2023
    if (movie == null) {
      movie = m;
      // 2.5.8 Step 15 - 11/11/2023
      numEntries += 1;
      numMovieEntries += 1;
      dateUpdated = DateAndTime.getDateTime(); // 2.5.9 Step 22 - 11/13/2023
    } else {
      // 2.5.8 Step 24 - 11/11/2023
      System.out.println("One movie is already in the library :(");
    }
  }

  // 2.5.8 Step 27 - 11/11/2023
  public void addSong(Song s)
  {
    if (song == null) {
      song = s;
      numEntries += 1;
      numSongEntries += 1;
      dateUpdated = DateAndTime.getDateTime(); // 2.5.9 Step 22 - 11/13/2023
    } else {
      System.out.println("One song is already in the library :(");
    }
  }

  // 2.5.8 Step 7 - 11/11/2023
  public void changeOwner(String o)
  {
    owner = o;
    // 2.5.9 Step 22 - 11/13/2023
    dateUpdated = DateAndTime.getDateTime(); 
  }

  // 2.5.8 Step 25 - 11/11/2023
  public void changeBook(Book b)
  {
    book = b;
    // 2.5.9 Step 22 - 11/13/2023
    dateUpdated = DateAndTime.getDateTime();
  }

  public void changeMovie(Movie m)
  {
    movie = m;
    // 2.5.9 Step 22 - 11/13/2023
    dateUpdated = DateAndTime.getDateTime();
  }

  public String toString() 
  {
    // 2.5.7 Step 5 & 31 - 11/09/2023
    // String info = book.toString() + "; " + movie.toString() + "; " + song.toString() + " : Last Updated " + dateUpdated; 
    String info = "";
    if (book != null) {
      info += book.toString() + "; ";
    }
    if (movie != null) {
      info += movie.toString() + "; ";
    }
    if (song != null) {
      info += song.toString();
    }
    
    info += " : Last Updated " + dateUpdated;
    
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