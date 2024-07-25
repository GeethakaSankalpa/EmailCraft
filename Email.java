import java.util.*;

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

    // receive first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED : " + this.firstName + " " + this.lastName);

        // ask for a department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //  return a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println(this.password);

        // combine elements to generate email
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@" + department +"." +companySuffix;
        System.out.println(email);
    }

    // ask for the department
    private String setDepartment() {
        Scanner scan = new Scanner(System.in);
        int departmentCode;
        System.out.println("""
                Department Codes\n
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
                System.out.println("Invalid department code.Please Try again.");
            }
        }
        if(departmentCode == 1){return "sales";}
        else if (departmentCode == 2){return "dev";}
        else if (departmentCode == 3){return "acct";}
        else {return "";}

    }

    // generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] password = new char[length];
        for (int i=0; i < length; i++){
            int randomPassword = (int) (Math.random() * passwordSet.length());

            password[i] = passwordSet.charAt(randomPassword);
        }
        return new String(password);

    }

    // set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;    // making this public so we can set some properties and we're hiding the actual property
    }

    // set the alternate email

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }


    // change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){return mailboxCapacity;}

    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }

}