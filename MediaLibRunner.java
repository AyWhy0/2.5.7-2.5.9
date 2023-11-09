/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    
    // 2.5.7 Step 2 - 11/09/2023
    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    // 2.5.7 Step 3 - 11/09/2023
    // System.out.println("Book created " + myBook);
    // 2.5.7 Step 4 - 11/09/2023
    myLib.addBook(myBook);
    // 2.5.7 Step 6 - 11/09/2023
    // System.out.println("Library:\n" + myLib);

    // 2.5.7 Step 8 - 11/09/2023
    int myRating = 5;
    myBook.adjustRating(myRating);
    // System.out.println(myBook);

    // 2.5.7 Step 9 - 11/09/2023
    myRating = 9000;

    // 2.5.7 Step 12 - 11/09/2023
    myBook.setTitle("Lord of the Flies");

    // 2.5.7 Step 14 - 11/09/2023
    myBook.setAuthor("Bolkien");
    
    // 2.5.7 Step 13 - 11/09/2023
    // System.out.println("Book:" + myBook);
    // System.out.println("Library: " + myLib);

    // 2.5.7 Step 15 - 11/09/2023
    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    System.out.println(myLib2);

    // 2.5.7 Step 22 - 11/09/2023
    // 2.5.7 Step 20 - 11/09/2023
    // System.out.println("before test:" + newBook);
    // myLib.testBook(newBook);
    // System.out.println("after test:" + newBook);

    // 2.5.7 Step 25 - 11/09/2023
    Book newBook2 = new Book("1984", "Orwell");
    // // newBook2.setTitle("a");
    System.out.println(newBook.equals(newBook2));


    // 2.5.7 Step 28 - 11/09/2023
    // 2.5.7 Step 27 - 11/09/2023
    // System.out.println(newBook2.title);
  }
}