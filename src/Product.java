
public interface Product {
    void displayInfo();
    Double calculateShippingCost(Double distance);
    default Boolean isFreeShipping(){
        if (calculateShippingCost(0.0) == 0){
            return true;
        } else {
            return false;
        }
    }

    default Double discountPrice(Double discountPercentage){
        return 0.0;
    }

    void applyAdditionalDiscount();


    double getPrice();
}
