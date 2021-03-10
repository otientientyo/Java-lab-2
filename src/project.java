import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        int Toan, Ly, Hoa;
        String Ten;
        Scanner input = new Scanner(System.in);


        System.out.println("Nhap diem Toan: ");
        Toan = input.nextInt();
        System.out.println("Nhap diem Ly: ");
        Ly = input.nextInt();
        System.out.println("Nhap diem Hoa: ");
        Hoa = input.nextInt();
        System.out.printf("NHap ten cua ban: ");
        Ten = input.next();

        System.out.printf("Ten: %s  Toan: %d   Ly: %d  Hoa: %d", Ten, Toan, Ly, Hoa);
    }
}
