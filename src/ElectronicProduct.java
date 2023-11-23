public class ElectronicProduct implements Product {
    private String name;
    private Double price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public static void setPriceSum(Double priceSum) {
        ElectronicProduct.priceSum = priceSum;
    }
    private Double weight;
    private static Double priceSum = 0.0;
    public ElectronicProduct(String name, Double price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        priceSum += price;
    }
    @Override
    public void displayInfo() {
        System.out.println("Name of product: " + name +
                "\nprice of product: " + price +
                "\nweight of product: " + weight
        );
    }
    @Override
    public Double calculateShippingCost(Double distance) {
        Double shippingCost = price * 0.1;
        return shippingCost / distance;
    }
    @Override
    public void applyAdditionalDiscount() {
    }
}
