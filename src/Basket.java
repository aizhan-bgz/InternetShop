public class Basket {
    private Product [] products;
    public Basket(int capacity) {
        this.products = new Product[capacity];
    }

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                System.out.println("Добавлено в корзину:  ");
                product.displayInfo();
                break;
            }
        }
    }
    public void display() {
        System.out.println("В корзине:");
        for (Product product : products) {
            if (product != null) {
                product.displayInfo();
            }
        }
    }

    public void calculateTotalCost() {
        double totalCost = 0.0;
        for (Product product : products) {

            if (product != null) {
                totalCost += product.getPrice();
            }
        }
        if (totalCost>10000){
            totalCost= totalCost * 0.9;}
        System.out.println("Общая стоимость товаров : " + totalCost );
    }
}


