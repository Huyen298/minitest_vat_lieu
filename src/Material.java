import java.time.LocalDate;

public abstract class Material {
    private String Id;
    private String name;
    private String LocalDate;
    private String manufacturingDate;
    int cost;

    public abstract double getAmount();

    public Material() {
    }

    public Material(String id, String name, String localDate, String manufacturingDate, int cost) {
        Id = id;
        this.name = name;
        LocalDate = localDate;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalDate() {
        return LocalDate;
    }

    public void setLocalDate(String localDate) {
        LocalDate = localDate;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Material{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", LocalDate='" + LocalDate + '\'' +
                ", manufacturingDate='" + manufacturingDate + '\'' +
                ", cost=" + cost +
                '}';
    }


}
