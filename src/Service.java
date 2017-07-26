
public class Service {
    private String name;
    private double price;
    private String otherInfo;

    public Service(String name, double price, String otherInfo) {
        this.name = name;
        this.price = price;
        this.otherInfo = otherInfo;
    }

    public Service() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }
}
