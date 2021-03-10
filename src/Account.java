import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        double accountBalance = 1000.00;
        double withraw =0.00;
        boolean possible = false;
        String cusname;


        System.out.printf(" Avaliable account balance: $%.2f \n",   accountBalance);
        System.out.println("Enter the Amount to withraw : $");
        Scanner scan = new Scanner(System.in);
        withraw = Double.parseDouble(scan.nextLine());
        System.out.println("Enter the Customer name:  ");
        cusname = scan.next();
        possible = (accountBalance > withraw);
        accountBalance = possible ? accountBalance - withraw: accountBalance;
        System.out.println("Welcome" + cusname);
        System.out.printf("\n Current account blance: $%.2f", accountBalance);
        System.out.println("\n Transaction Successful: " + possible);
    }
}
