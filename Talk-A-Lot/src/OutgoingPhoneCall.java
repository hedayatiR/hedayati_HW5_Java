public class OutgoingPhoneCall extends PhoneCall {
    private double timeDuration;

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public double getPrice(){
        return this.price;
    }

    public OutgoingPhoneCall(String phoneNumber, double timeDuration){
        super(phoneNumber);
        this.timeDuration = timeDuration;
        this.setPrice(0.04);
    }

    public void displayCallInformation(){
        System.out.println("Outgoing phone number : " + this.getPhoneNumber());
        System.out.println("The rate per minute is : " + this.getPrice());
        System.out.println("The call duration is(in minutes) : " + this.timeDuration);
        System.out.println("The total price is : " + this.getPrice()* this.timeDuration);
        System.out.println();
    }
}
