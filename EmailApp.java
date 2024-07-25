import java.util.*;

public class EmailApp {
    public static void main(String[] args){
        menu();
//        Email email = new Email("Geethaka", "Sankalpa");
//        System.out.println(email.showInfo());

    }

    public static void menu(){
        int choice;
        System.out.println("Welcome to Automatic Email Generator");
        while(true){
            System.out.println("1. Enter your first name\n2. Enter your last name\n0. Exit.\n");
            Scanner scan = new Scanner(System.in);
            System.out.print("Select your choice: ");
            try{
                choice = scan.nextInt();
                break;
            }
            catch (InputMismatchException e){System.out.println("Please check your input.");}
        }


    }
}