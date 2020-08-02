
import lombok.Value;


public class Registration {

        @Value
        public static class UserForCardDelivery {
            private  String city;
            private  String dateOfFirstMeeting;
            private  String lastName;
            private  String firstName;
            private  String phoneNumber;
            private  String dateOfSecondMeeting;

        }
    }