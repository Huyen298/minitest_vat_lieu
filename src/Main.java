import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<CrispyFlour> bot = new ArrayList<>();
        CrispyFlour botNgo = new CrispyFlour("001", "Bột Ngô", "12/2/2021", "17/2/2021", 30, 5);
        CrispyFlour botGao = new CrispyFlour("002", "Bột Gạo", "2/12/2021", "2/1/2022", 50, 3);
        CrispyFlour botNang = new CrispyFlour("003", "Bột Năng", "2/12/2021", "2/2/2022", 50, 3);
        CrispyFlour botNo = new CrispyFlour("004", "Bột Nở", "22/12/2021", "22/1/2022", 50, 3);
        CrispyFlour botMi = new CrispyFlour("005", "Bột Mì", "2/12/2021", "2/1/2023", 50, 3);
        bot.add(botNgo);
        bot.add(botGao);
        bot.add(botNang);
        bot.add(botNo);
        bot.add(botMi);
        ArrayList<Meat> thit= new ArrayList<>();
        Meat bo= new Meat("001","Thịt bò","26/2/2021","28/2/2021",300,5);
        Meat ga= new Meat("002","Thịt gà","26/2/2021","28/3/2021",30,10);
        Meat heo= new Meat("003","Thịt heo","2/12/2021","28/2/2022",100,15);
        Meat trau= new Meat("004","Thịt trâu","6/5/2021","28/12/2021",500,4);
        Meat cuu= new Meat("005","Thịt cừu","26/2/2021","28/2/2024",400,25);
        thit.add(bo);
        thit.add(ga);
        thit.add(heo);
        thit.add(trau);
        thit.add(cuu);

        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Danh sách bột");
            System.out.println("2. Danh sách thịt");
            System.out.println("3. Thêm vật liệu mới");
            System.out.println("4. Sửa");
            System.out.println("5. Xóa");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách bột: ");
                    Manager.showArrFlour(bot);
                    break;
                case 2:
                    System.out.println("Danh sách thịt: ");
                    Manager.showArrMeat(thit);

            }
        }
    }
}

