public class BookArray {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        for (int i = 0; i < books.length; i++) {
            String title = "book" + i;
            if (i<5)
                books[i] = new Fiction(title);
            else
                books[i] = new NonFiction(title);
        }

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getTitle() + " price is : " + books[i].getPrice());
        }
    }

}
