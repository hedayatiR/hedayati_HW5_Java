public abstract class NewspaperSubscription {
    private String subscriberName;
    protected String address;
    protected double rate;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getAddress() {
        return address;
    }

    public abstract void setAddress(String address);

    public double getRate() {
        return rate;
    }

}
