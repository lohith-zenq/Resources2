package Selbasics;

public class ScenariosforGmail
{
    public void testscenarios()
    {
        //Scenario for valid homepage Title
        String expectedtitle = "Welcome to Gmail";

        String actualtitle = "Welcome to cmail";
        if (actualtitle == expectedtitle) {
            System.out.println("Valid title is displayed");

        } else {
            System.out.println("InValid title as displayed");

        }
        System.out.println("Please enter valid Phone no");

    }
    static class login extends ScenariosforGmail {
        public void testscenarios()
        {
              //Scenario for login
            long phoneno = 7093594884l;
            long verifyphnoforOTP=709359884l;
            if (phoneno == verifyphnoforOTP)
            {
                System.out.println("OTPno should be send for above phoneno");

            } else {
                System.out.println("OTPno should not be send");
            }
            System.out.println("OTP sent");

        }
    }

}