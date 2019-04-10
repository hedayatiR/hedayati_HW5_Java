public class IncomingPhoneCall extends PhoneCall {

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public double getPrice(){
        return this.price;
    }

    public IncomingPhoneCall(String phoneNumber){
        super(phoneNumber);
        setPrice(0.02);
    }

    public void displayCallInformation(){
        System.out.println("Incoming phone number : " + this.getPhoneNumber());
        System.out.println("The rate per minute is : " + this.getPrice());
        System.out.println("The price is : " + this.getPrice());
        System.out.println();
    }
}
