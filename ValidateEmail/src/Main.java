// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static EmailExample emailExample;
    public static final String[] validEMail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEMail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is : " + email + " is valid : " + isvalid);

        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is : " + email + " is valid: " + isvalid);
        }
    }
}