public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    public void setAddress(String address){
        if (address.matches(".*\\d.*")) {
            this.address = address;
            this.rate = 15;
        }
        else {
            System.out.println("The address contains no digits");
            this.address = "Invalid";
            this.rate = 0;
        }

    }
}
