package java_collections_framework.bai_tap.linkedlist_arraylist_with_java_collections_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Products {
    private int id;
    private String name;
    private float prices;
    Scanner scanner = new Scanner(System.in);

    public Products(){

    }
    
    public Products(int id, String name, float prices){
        this.id = id;
        this.name = name;
        this.prices = prices;
    }

    public float getPrices() {
        return prices;
    }

    public void setPrices(float prices) {
        this.prices = prices;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public static List<Products> listProducts = new ArrayList<>();

    public void addProduct(Products product){
        listProducts.add(product);
    }

    public void editProduct(int id){
        for (int i = 0; i < listProducts.size(); i++) {
            Products product1 = new Products();
            product1 = listProducts.get(i);
            if(id == product1.getId()){
                System.out.println("Name of product : ");
                String name = scanner.nextLine();
                System.out.println("Prices of product : ");
                Float prices = scanner.nextFloat();
                product1 = new Products(product1.id,name,prices);
                listProducts.set(i,product1);
            }
        }
    }

    public void deleteProduct(int id){
        for (int i = 0; i < listProducts.size(); i++) {
            Products product1 = new Products();
            product1 = listProducts.get(i);
            if(id == product1.getId()){
                listProducts.remove(i);
                System.out.println("Đã xóa phần tử có ID : " + id);
            }
        }
    }

    public void displayProducts(){
        for (Products products : listProducts) {
            System.out.printf("This ID : %d\nThis NAME : %s\nThis PRICES : %f\n",
            products.getId(), products.getName(),products.getPrices());
        }
    }

    public Products searchProduct(String name){
        for (Products products : listProducts){
            if (name == products.getName()){
                return products;
            }
        }
        return null;
    }

    public void sortDown(){
        for (int i = 0; i < listProducts.size()-1; i++) {
            for (int j = i+1; j < listProducts.size(); j++) {
                if(listProducts.get(i).getPrices() < listProducts.get(j).getPrices()){
                    Products temp = listProducts.get(i);
                    listProducts.set(i, listProducts.get(j));
                    listProducts.set(j, temp);
                }
            }
        }
    }

    public void sortUp(){
        for (int i = 0; i < listProducts.size()-1; i++) {
            for (int j = i+1; j < listProducts.size(); j++) {
                if(listProducts.get(i).getPrices() > listProducts.get(j).getPrices()){
                    Products temp = listProducts.get(i);
                    listProducts.set(i, listProducts.get(j));
                    listProducts.set(j, temp);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "This ID : " + getId()
              +"\nThis Name : " + getName()
              +"\nThis Prices : " + getPrices()
              +"\n=============================";
    } 
}
