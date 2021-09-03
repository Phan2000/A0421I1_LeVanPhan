package java_collections_framework.bai_tap.linkedlist_arraylist_with_java_collections_framework;

public class Main {
    public static void main(String[] args) {
        Products products = new Products();

        products.addProduct(new Products(1,"Bread",15));
        products.addProduct(new Products(2,"Folk",127));
        products.addProduct(new Products(3,"Milk",33));
        products.addProduct(new Products(4,"Fruits",21));

        // products.displayProducts();
        // System.out.println("====================");
        // products.editProduct(2);
        // products.displayProducts();
        // System.out.println("====================");
        // products.deleteProduct(4);
        // products.displayProducts();       
        // System.out.println("====================");
        // Products p1 = products.searchProduct("Folk");
        // System.out.println(p1.toString());
        products.sortUp();
        System.out.println("Sort Up : ");
        products.displayProducts();
        
        products.sortDown();
        System.out.println("Sort Down : ");
        products.displayProducts();
        
    }
}
