public class Meat extends Material{
    private double weight;

    @Override
    public double getAmount() {
        double price= cost* weight;
        return price;
    }

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, String localDate, String manufacturingDate, int cost, double weight) {
        super(id, name, localDate, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "ID: "+getId()+
                ", Tên: "+getName()+
                ", Ngày sản xuất: "+getLocalDate()+
                ", Ngày hết hạn: "+getManufacturingDate()+
                ", Giá: "+getCost()+
                ", Khối lượng: " + weight +
                '}';
    }
}
