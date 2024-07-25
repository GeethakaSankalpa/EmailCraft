import java.util.*;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // receive first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED : " + this.firstName + " " + this.lastName);

        // ask for a department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
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
        if(departmentCode == 1){return "Sales";}
        else if (departmentCode == 2){return "Dev";}
        else if (departmentCode == 3){return "Acct";}
        else {return "";}

    }
}