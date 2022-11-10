import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerProduct managerProduct = new ManagerProduct();
        while (true) {
            System.out.println("Quản lý Sản Phẩm");
            System.out.println("1. Thêm");
            System.out.println("2. Sửa");
            System.out.println("3. xóa");
            System.out.println("4. Hiển thị");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Product product = managerProduct.creatProduct();
                    managerProduct.add(product);
                    break;
                case 2:
                    System.out.println("Nhập vị trí muốn sửa");
                    int indexEdit = Integer.parseInt(scanner.nextLine());
                    Product productEdit = managerProduct.creatProduct();
                    managerProduct.edit(indexEdit, productEdit);
                    break;
                case 3:
                    System.out.println("Nhập vị trí muốn xóa");
                    int indexDelete = Integer.parseInt(scanner.nextLine());
                    managerProduct.delete(indexDelete);
                    break;
                case 4:
                    managerProduct.show();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }

        }
    }
}
