public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription physicalNewspaperSubscription1 = new PhysicalNewspaperSubscription();
        physicalNewspaperSubscription1.setAddress("Tehran");
        PhysicalNewspaperSubscription physicalNewspaperSubscription2 = new PhysicalNewspaperSubscription();
        physicalNewspaperSubscription2.setAddress("Tehran-Zone2");
        PhysicalNewspaperSubscription physicalNewspaperSubscription3 = new PhysicalNewspaperSubscription();
        physicalNewspaperSubscription3.setAddress("Tehran-Zone22");


        OnlineNewspaperSubscription onlineNewspaperSubscription1 = new OnlineNewspaperSubscription();
        onlineNewspaperSubscription1.setAddress("RezaHedayati");
        OnlineNewspaperSubscription onlineNewspaperSubscription2 = new OnlineNewspaperSubscription();
        onlineNewspaperSubscription2.setAddress("RezaHedayati@yahoo.com");
        OnlineNewspaperSubscription onlineNewspaperSubscription3 = new OnlineNewspaperSubscription();
        onlineNewspaperSubscription3.setAddress("RezaHedayati@gmail.com");

      NewspaperSubscription[] newspaperSubscriptions = { physicalNewspaperSubscription1, physicalNewspaperSubscription2,
              physicalNewspaperSubscription3, onlineNewspaperSubscription1, onlineNewspaperSubscription2,
              onlineNewspaperSubscription3 };

        System.out.println();
        for (int i = 0; i < newspaperSubscriptions.length; i++) {
            String name = "User " + (i+1);
            newspaperSubscriptions[i].setSubscriberName(name);

            System.out.println(newspaperSubscriptions[i].getSubscriberName() + " address is " +
                    newspaperSubscriptions[i].getAddress() + ". The rate is " + newspaperSubscriptions[i].getRate());
        }

    }
}
