import java.util.*;

/**
 * The Email class represents an email account with a password, department, and mailbox capacity.
 */
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "company.com";

    /**
     * Constructor to create an Email object with a first name and last name.
     * @param firstName the first name of the email account holder
     * @param lastName the last name of the email account holder
     */
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // ask for a department
        this.department = setDepartment();

        //  return a random password
        this.password = randomPassword(defaultPasswordLength);

        // combine elements to generate email
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@" + department +"." +companySuffix;

    }

    /**
     * Asks the user to select a department and returns the corresponding department code.
     * @return the department code as a string
     */
    private String setDepartment() {
        Scanner scan = new Scanner(System.in);
        int departmentCode;
        System.out.println("""
                \nDepartment Codes\n
                1 for Sales
                2 for Development
                3 for Accounting
                4 for None\n""");
        while (true) {
            try {
                System.out.println("Enter Department code : ");
                departmentCode = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid department code.Please Try again.\n");
            }
        }
        if(departmentCode == 1){return "sales";}
        else if (departmentCode == 2){return "dev";}
        else if (departmentCode == 3){return "acct";}
        else {return "";}

    }

    /**
     * Generates a random password of a given length.
     * @param length the length of the password to generate
     * @return a random password as a string
     */
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] password = new char[length];
        for (int i=0; i < length; i++){
            int randomPassword = (int) (Math.random() * passwordSet.length());

            password[i] = passwordSet.charAt(randomPassword);
        }
        return new String(password);

    }

    /**
     * Sets the mailbox capacity of the email account.
     * @param capacity the mailbox capacity in megabytes
     */
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;    // making this public so we can set some properties and we're hiding the actual property
    }

    /**
     * Sets the alternate email address of the email account.
     * @param alternateEmail the alternate email address
     */
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    /**
     * Changes the password of the email account.
     * @param password the new password
     */
    public void changePassword(String password){
        this.password = password;
    }

    /**
     * Returns the mailbox capacity of the email account.
     * @return the mailbox capacity in megabytes
     */
    public int getMailboxCapacity(){return mailboxCapacity;}

    /**
     * Returns the alternate email address of the email account.
     * @return the alternate email address
     */
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}

    /**
     * Returns a string representation of the email account information.
     * @return a string containing the display name, company email, password, and mailbox capacity
     */
    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nPASSWORD: " + password +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }

}