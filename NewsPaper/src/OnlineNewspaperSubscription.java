public class OnlineNewspaperSubscription extends NewspaperSubscription{

    public void setAddress(String address){
        if (address.contains("@")){
            this.address = address;
            this.rate = 9;
        }
        else{
            System.out.println("The address contains no @");
            this.address = "Invalid";
            this.rate = 0;
        }

    }
}
