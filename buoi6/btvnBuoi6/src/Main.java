import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalManager am = new AnimalManager(0);
        System.out.println("nhap vao chuc nang: ");
        int type = 0;
        do {
            System.out.println("1: them dong vat");
            System.out.println("2: hien thi thong tin");
            System.out.println("3: tim dong vat theo ten");
            System.out.println("4: xoa");
            System.out.println("5: thoat");
            type = new Scanner(System.in).nextInt();
            Animal animal = null;
            switch (type){
                case 1:
                    am.addAnimal();
                    break;
                case 2:
                    am.showAllAnimals();
                    break;
                case 3:
                    am.search();
                    break;
                case 4:
                    am.delete();
                    break;
                case 5:
                    System.out.println("thoat");
                    break;
                default:
                    System.out.println("invalid type, type again");
                    type = 1;
            }
        }while(type < 5);
    }
}
