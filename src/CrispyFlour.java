import java.time.LocalDate;

public class CrispyFlour extends Material{
    private int quantity;

    @Override
    public double getAmount() {
        double price = quantity*cost;
        return price;
    }


    public CrispyFlour() {
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, String localDate, String manufacturingDate, int cost, int quantity) {
        super(id, name, localDate, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "ID: "+ getId()+
                ", Tên: "+getName()+
                ", Ngày sản xuất: "+getLocalDate()+
                ", Ngày hết hạn: "+getManufacturingDate()+
                ", Giá: "+getCost()+
                ", số lượng: " + quantity +
                '}';
    }
}
