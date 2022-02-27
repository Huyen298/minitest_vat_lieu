import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Manager {
    public static void showArrFlour(ArrayList<CrispyFlour> bot){
        for (CrispyFlour e:bot
        ) {
            System.out.println(e);
        }
    }
    public static void showArrMeat(ArrayList<Meat> thit){
        for (Meat e :thit
             ) {
            System.out.println(e);
        }
    }
    public static CrispyFlour creatNewFlour(){
        System.out.println("Nhập Id");
        Scanner scanner= new Scanner(System.in);
        String id = scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Ngày sản xuất");
        String localDate = scanner.nextLine();
        System.out.println("Ngày hết hạn");
        String hsd= scanner.nextLine();
        System.out.println("Giá");
        int gia = scanner.nextInt();
        System.out.println("Nhập số lượng");
        Scanner c= new Scanner(System.in);
        int quality = scanner.nextInt();
        CrispyFlour flour= new CrispyFlour(id,name,localDate,hsd,gia,quality);
        return flour;
    }
    public static Meat creatNewMeat(){
        System.out.println("Nhập Id");
        Scanner scanner= new Scanner(System.in);
        String id = scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Ngày sản xuất");
        String localDate = scanner.nextLine();
        System.out.println("Ngày hết hạn");
        String hsd= scanner.nextLine();
        System.out.println("Giá");
        int gia = scanner.nextInt();
        System.out.println("Khối lượng");
        Scanner c= new Scanner(System.in);
        int weight = scanner.nextInt();
        Meat meat= new Meat(id,name,localDate,hsd,gia,weight);
        return meat;

    }
}
