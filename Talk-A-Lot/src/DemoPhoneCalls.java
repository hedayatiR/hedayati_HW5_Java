public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall inphoneObj = new IncomingPhoneCall("09123128243");
        OutgoingPhoneCall outPhoneObj = new OutgoingPhoneCall("02144553214", 12);

        inphoneObj.displayCallInformation();
        outPhoneObj.displayCallInformation();
    }
}
