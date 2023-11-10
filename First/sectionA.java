import java.util.Scanner;
public class sectionA{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1,num2,userOption;
        float result;
        String userChoice;
        do{
        System.out.println("Menu");
        System.out.println("---------------------");
        System.out.println("Enter Number 1: ");
        num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        num2 = sc.nextInt();
        System.out.println("Select operation");
        System.out.println("---------------------");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("Select option: ");
        userOption = sc.nextInt();
        
        switch (userOption) {
            case 1:
                result = num1 + num2;
                System.out.println("The result is: "+ result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The result is: "+ result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The result is: "+ result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println("The result is: "+ result);
                break;
        
            default:
                System.out.println("Selection does not exist");
                break;
        }

        sc.nextLine();

        System.out.println("Do you wish to continue?(Y/N): ");
        userChoice = sc.nextLine();
        
    }while(userChoice.equalsIgnoreCase("Y"));
    
    sc.close();
}
}