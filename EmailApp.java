import java.util.*;

/**
 * EmailApp is a console-based application that generates emails and passwords.
 */
public class EmailApp {
    public static void main(String[] args){
        menu();
    }

    /**
     * The menu method that displays the options to the user and handles their input.
     */
    public static void menu(){
        int choice;
        Email email = null;
        System.out.println("Welcome to Automatic Email Generator\n");
        while(true){
            System.out.println("1. Generate Email and Password\n2. Change password\n3. Set mailbox capacity\n4. Set alternate email address\n0. Exit.\n");
            Scanner scan = new Scanner(System.in);
            System.out.print("Select your choice: ");
            try{
                choice = scan.nextInt();
                if (choice == 0) {
                    System.out.println("Good Bye!");
                    break;
                }
                if (email == null && choice!= 1) {
                    System.out.println("Please generate an email and password first.");
                    continue;
                }
                switch(choice){
                    case 1:
                        System.out.print("Enter first name: ");
                        String firstName = scan.next();
                        System.out.print("Enter last name: ");
                        String lastName = scan.next();
                        email = new Email(firstName, lastName);
                        System.out.println("Email and Password generated successfully");
                        System.out.println(email.showInfo());
                        break;
                    case 2:
                        System.out.print("Enter new password: ");
                        String newPassword = scan.next();
                        email.changePassword(newPassword);
                        break;
                    case 3:
                        System.out.print("Enter mailbox capacity: ");
                        int capacity = scan.nextInt();
                        email.setMailboxCapacity(capacity);
                        break;
                    case 4:
                        System.out.print("Enter alternate email address: ");
                        String alternateEmail = scan.next();
                        email.setAlternateEmail(alternateEmail);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
            catch (InputMismatchException e){System.out.println("Please check your input."); scan.next();}
        }
    }
}