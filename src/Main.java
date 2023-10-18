import model.Product;
import products.ProductsArray;

public class Main {
    public static void main(String[] args) {
        /*
        InventoryApp app = new InventoryApp();
        app.runMenu();


        ProductsArray productsInstance = new ProductsArray();
        productsInstance.mostrarProductos();

         */

        Product product = new Product("Laptop", 999.99, 5);

        // Verificar si el producto está sin inventario
        System.out.println("¿El producto está sin inventario? " + product.isOutOfStock());

        // Verificar si el precio del producto es mayor a un valor
        System.out.println("¿El precio del producto es mayor a 500? " + product.isPriceGreaterThan(500.0));

        // Verificar si el precio del producto es menor o igual a un valor
        System.out.println("¿El precio del producto es menor o igual a 1000? " + product.isPriceLessThanOrEqualTo(1000.0));

        // Verificar si el nombre del producto contiene una palabra
        System.out.println("¿El nombre del producto contiene 'top'? " + product.containsKeyword("top"));

    }
}