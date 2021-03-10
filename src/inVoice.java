import java.util.Scanner;

public class inVoice {
    public static void main(String[] args) {
        int orderedShirts, orederdTrousers, points=0;
        int priceOfShirt = 300;
        int priceofTrouser = 700;
        int costOfShirts, costOfTrousers, Totalcost;
        double discount, netPay;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the  number of Shirts to order: ");
        orderedShirts = input.nextInt();
        System.out.println("Enter the number of Trousers to order: ");
        orederdTrousers = input.nextInt();

        costOfShirts = priceOfShirt * orderedShirts;
        costOfTrousers = priceofTrouser * orederdTrousers;
        Totalcost = costOfShirts + costOfTrousers;

        discount = Totalcost > 3000? Totalcost * 10/100 :0;
        netPay = Totalcost - discount;
        points = (int) (netPay > 3000? netPay/100 :0);
// Display
        System.out.println("\n Item \t\t Quanity \t  Price \t  Total ");
        System.out.println("________________________________________________");
        System.out.printf("Shirts \t\t %d\t\t %d\t\t %d\n ", orderedShirts, priceOfShirt, costOfShirts);
        System.out.printf("Trouser \t\t %d\t\t %d\t\t %d\n", orederdTrousers, priceofTrouser, costOfTrousers);
        System.out.printf("Discout \t \t\t \t\t\t\t %.2f \n", discount);
        System.out.println("_________________________________");

        System.out.printf("Net total \t \t\t \t\t\t\t %.2f \n", netPay);
        System.out.println("_________________________________");
        System.out.printf("Points Earned : \t  %d  \n ", points);
        System.out.println("Thanks U!");
    }
}
