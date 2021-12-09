public class Product {
    private String code;
    private String name;
    private  int price;
    private String type;
    private double USD;

    public Product(String code, String name, int price, String type, double USD){
        this.code = code;
        this.name = name;
        this.price = price;
        this.type = type;
        this.USD = USD;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getUSD() {
        return USD;
    }

    public void setUSD(double USD) {
        this.USD = USD;
    }
}
