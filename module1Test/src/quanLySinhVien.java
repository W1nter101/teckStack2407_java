import java.util.Scanner;

public class quanLySinhVien {
    public static void main(String[] args) {
        studentManager sm = new studentManager();
        System.out.println("nhập vào chức năng: ");
        Scanner sc = new Scanner(System.in);
        int type = 0;
        do {
            System.out.println("1: thêm sinh viên: ");
            System.out.println("2: sửa thông tin sinh viên: ");
            System.out.println("3: xóa sinh viên theo id:  ");
            System.out.println("4: tìm kiếm sinh viên theo tên: ");
            System.out.println("5: hiển thị danh sách sinh viên");
            System.out.println("6: thoát");
            type = sc.nextInt();
            switch (type) {
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.changeInfo();
                    break;
                case 3:
                    sm.delete();
                    break;
                case 4:
                    sm.find();
                    break;
                case 5:
                    sm.showAll();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("invalid type, try again");
                    type = 1;

            }
        }while(type < 6);

    }
}
