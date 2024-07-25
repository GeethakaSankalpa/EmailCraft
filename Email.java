import java.util.*;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;


    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED : " + this.firstName + " " + this.lastName);
    }

    private String setDepartment(){
        Scanner scan = new Scanner(System.in);
        int departmentCode;
        System.out.println("""
            Department Codes
            1 for Sales
            2 for Development
            3 for Accounting
            4 for None""");
        while (true){
            try {
                System.out.println("Enter Department code : ");
                departmentCode = scan.nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println("Invalid department code.Please Try again.");
            }
        }
        switch(departmentCode) {
            case 1:
                return "Sales";
                break;
            case2:
                return "Dev";
                break;
            case 3:
                re
        }


    }
}