import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of products :");
        int quantity = scanner.nextInt();
        System.out.println("Enter the product code :");
        String code = scanner.nextLine();
        System.out.println("Enter the product name :");
        String name = scanner.nextLine();
        System.out.println("Enter the product price :");
        int price = scanner.nextInt();
        System.out.println("Enter the product price :");
        String type = scanner.nextLine();
        System.out.println("Enter the product type :");
        double unit = scanner.nextDouble();
        System.out.println("Enter the product unit :");

        arr = new int[quantity];
        int i = 0;
        int sum = 0;
        while (i < quantity) {
            for (int j = 0; j < quantity; j++) {
                System.out.print("Enter the product code :");
                arr[i] = scanner.nextInt();
            }
            i++;
            sum += arr[i];
        }
        System.out.println("Total Products is : " + sum);
    }
}

