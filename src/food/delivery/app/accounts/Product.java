package food.delivery.app.accounts;

public class Product {
    
    private static int new_id=0;
    private String product;
    private int id;
    private double price;
    private String category;
    

    Product(String product, double price, String category){

        this.product = product;
        this.id = new_id;
        this.price = price;
        new_id=new_id+1;
        this.category = category;
    };
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getProduct() {
        return product;
    }
    public String getCategory() {
        return category;
    }
    
}
