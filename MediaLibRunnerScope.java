// Alessandra Yu
// 2.5.9 Step 1 - 11/13/2023

import java.util.Scanner;

public class MediaLibRunnerScope
{
  public static void main(String[] args)
  {
    MediaLib myLib = new MediaLib();
    myLib.addMovie(new Movie("Raiders of the Lost Ark", 1.9));
    myLib.addBook(new Book("1984", "Orwell"));
    myLib.addSong(new Song("In Your Eyes"));
    System.out.println(MediaLib.getOwner() + "'s Library:\n" + myLib);

    // // 2.5.9 Step 11 - 11/13/2023
    // Book newBook = new Book("ABC", "ZYX");
    // newBook.adjustRating(2);
    // newBook.adjustRating(20);

    // 2.5.9 Step 22 - 11/13/2023
    // wait a bit to get a new date
    System.out.println("Wait a second or two so Library 2 has a different time.");
    System.out.print("Press <ENTER> to continue...");
    Scanner s = new Scanner(System.in);
    String temp = s.nextLine();

    MediaLib myLib2 = new MediaLib();
    myLib2.addSong(new Song("In Your Eyes"));
    System.out.println("Library2:\n" + myLib2);
  }
}

