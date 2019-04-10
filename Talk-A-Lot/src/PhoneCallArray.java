public class PhoneCallArray {
    public static void main(String[] args) {
        PhoneCall[] phoneCalls = new PhoneCall[8];

        for (int i = 0; i < phoneCalls.length; i++) {
            String phoneNumber = "0214412786" + i;
            if (i<4)
                phoneCalls[i] = new IncomingPhoneCall(phoneNumber);
            else
                phoneCalls[i] = new OutgoingPhoneCall(phoneNumber, (i+3));
        }

        for (int i = 0; i < phoneCalls.length; i++) {
            phoneCalls[i].displayCallInformation();
        }
    }
}
