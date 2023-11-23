public class ClothingProduct implements Product {
    private String size;
    private String brand;
    private String color;
    private Double price;
    private static Double priceSum = 0.0;
    public ClothingProduct(String size, String brand, String color, Double price) {
        this.size = size;
        this.brand = brand;
        this.color = color;
        this.price = price;
        priceSum+=price;
    }
    @Override
    public void displayInfo() {
        System.out.println("Brand of product: " + brand +
                "\ncolor of product: " + color +
                "\nsize of product: " + size +
                "\nprice of product: " + price);
    }
    @Override
    public Double calculateShippingCost(Double distance) {
        Double shippingCost = price * 0.1;
        return shippingCost / distance;
    }
    @Override
    public Boolean isFreeShipping() {
        return Product.super.isFreeShipping();
    }

    @Override
    public void applyAdditionalDiscount() {
    }
    @Override
    public double getPrice() {
        return 0;
    }
}
