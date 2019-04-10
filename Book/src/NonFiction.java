public class NonFiction extends Book {
    public NonFiction(String title){
        super(title);
        this.setPrice();
    }

    public void setPrice(){
        this.price = 37.99;
    }
}

