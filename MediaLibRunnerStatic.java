// 2.5.8 Step 1 - 11/11/2023
public class MediaLibRunnerStatic 
{
    public static void main(String[] args) {
        System.out.println(MediaLib.owner + "'s Library");
        // 2.5.8 Step 14 - 11/11/2023
        // System.out.println(MediaLib.getNumEntries());

        // 2.5.8 Step 16 - 11/11/2023
        MediaLib lib1 = new MediaLib();
        Movie newMovie = new Movie("The Very Hungry Caterpillar", 2.25);
        lib1.addMovie(newMovie);
        System.out.println(lib1);

        MediaLib lib2 = new MediaLib();
        Book newBook = new Book("To Kill a Mockingbird", "Lee");
        lib2.addBook(newBook);
        System.out.println(lib2);
    }
}