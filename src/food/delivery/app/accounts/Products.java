package food.delivery.app.accounts;

import java.util.ArrayList;
import java.util.List;

public class Products {
    List<Product> products;

    Products() {
        products = new ArrayList<Product>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public Product getProductById(int id) {
        Product product = null;
        for (Product p : products) {
            if (p.getId() == id) {
                product = p;
            }
        }
        return product;
    }

    public void removeProductById(int id) {
       boolean is_remove=products.removeIf(e -> (e.getId() == id));
       if(is_remove){
           System.out.println("Product Remove Successfully");
       }else{
           System.out.println("Invalid Id");
       }
    }

    public List<Product> getProductsByCategory(String category) {
        List<Product> catalog = new ArrayList<Product>();
        for (Product p : catalog) {
            if (p.getCategory().contains(category)) {
                catalog.add(p);
            }
        }
        return catalog;
    }
    public void displayProducts(){
        System.out.println("\n.................\nProducts List\n........................");
        for (Product product : products) {
            System.out.println("Product Id:"+product.getId());
            System.out.println("Product:"+product.getProduct());
            System.out.println("Category:"+product.getCategory());
            System.out.println("Price:"+product.getPrice());
            System.out.println(".............................");

        }
        if (products.isEmpty()){
            System.out.println("No Product Found");
        }
    }

    public static void main(String[] args) {
        Products cart = new Products();
        cart.addProduct(new Product("Custard", 4.5, "Sweets"));
        cart.addProduct(new Product("Milk", 8.5, "Shakes"));
        cart.addProduct(new Product("Custard", 4.5, "Sweets"));
        cart.displayProducts();
        cart.removeProductById(1);
        cart.displayProducts();
    }
}