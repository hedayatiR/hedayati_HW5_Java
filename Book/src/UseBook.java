public class UseBook {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("Song of ice and fire");
        NonFiction nonFictionBook = new NonFiction("Mein Kampf");
        System.out.println(fictionBook.getTitle() + " price is : " + fictionBook.getPrice());
        System.out.println(nonFictionBook.getTitle() + " price is : " + nonFictionBook.getPrice());
    }
}

