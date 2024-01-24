package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product> {
    private int id;
    private double weight;
    private double price;

    public Product(int id, double weight, double price) {
        this.id = id;
        this.weight = weight;
        this.price = price;
    }

    // Implementing compareTo method from Comparable interface
    @Override
    public int compareTo(Product otherProduct) {
        // Compare products based on their price
        return Double.compare(this.price, otherProduct.price);
    }

    // Getter methods for the variables
    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    // toString method for better representation
    @Override
    public String toString() {
        return "Product{id=" + id + ", weight=" + weight + ", price=" + price + '}';
    }
}

public class ProductComparison {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Adding some sample products to the list
        products.add(new Product(1, 0.5, 20.0));
        products.add(new Product(2, 1.0, 15.0));
        products.add(new Product(3, 0.8, 25.0));

        // Sorting the list of products based on price
        Collections.sort(products);

        // Printing the sorted list of products
        System.out.println("Sorted Products based on Price:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

