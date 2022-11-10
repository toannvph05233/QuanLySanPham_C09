import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bất kỳ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("a = " + a);
        System.out.println("Nhập chuỗi bất kỳ");
        String b = scanner.nextLine();
        System.out.println("b = " + b);
    }
}
