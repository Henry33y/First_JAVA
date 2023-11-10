import java.util.Scanner; 
public class main{
    public static void main(String[] args){
        String userChoice;
        Scanner sc = new Scanner(System.in);
        //Accept Customer Details
        do{
            System.out.println("Please enter your details");
            System.out.println("---------------------------");
            System.out.println("Enter your Customer ID: ");
            String cusId = sc.nextLine();
            System.out.println("Enter your First Name: ");
            String firstName = sc.nextLine();
            System.out.println("Enter your Last Name");
            String lastName = sc.nextLine();
            System.out.println("Enter your Address");
            String address = sc.nextLine();
            System.out.println("Enter your Phone Number");
            String phoneNo = sc.nextLine();
            System.out.println("Enter your Product Bought");
            String productBought = sc.nextLine();
            System.out.println("Enter your Unit Price");
            float unitPrice = sc.nextFloat();
            System.out.println("Enter the Quantity Bought");
            int quantity = sc.nextInt();
            //Calculate and display amount to be paid
            float amountPaid = unitPrice * quantity;
            System.out.println("The Amount Paid is: Ghc "+amountPaid);
            sc.nextLine();
            System.out.println("Do you wish to continue? (Y/N): ");
            userChoice = sc.nextLine();
        }
        while(userChoice.equals("Y") || userChoice.equals("y"));
        
        sc.close();
        
    }
}