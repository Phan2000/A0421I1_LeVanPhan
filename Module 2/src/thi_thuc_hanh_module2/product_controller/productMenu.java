package thi_thuc_hanh_module2.product_controller;

import thi_thuc_hanh_module2.product.NotFoundProductException;
import thi_thuc_hanh_module2.product.ProductExport;
import thi_thuc_hanh_module2.product.ProductImport;

import java.util.Scanner;

public class productMenu {
    static Scanner scanner = new Scanner(System.in);
    public static void displayMenu() throws NotFoundProductException {
        int choice;
        while (true) {
            System.out.println("--CONTROLLER PRODUCT MENU--");
            System.out.println("Enter function to continue: ");
            System.out.println("1. add New");
            System.out.println("2. Delete");
            System.out.println("3. View product list");
            System.out.println("4. Find product");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNew();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    viewProduct();
                    break;
                case 4:
                    findProduct();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    static ProductImport productImport =  new ProductImport();
    static ProductExport productExport = new ProductExport();

    public static void addNew(){
        out:
        while (true){
            System.out.println("1. Add new Product import");
            System.out.println("2. Add new product Export");
            System.out.println("Your selection: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    productImport.addNew();
                    break out;
                case 2:
                    productExport.addNew();
                    break out;
            }
        }
    }
    public static void delete(){
        out:
        while (true){
            System.out.println("1. Delete Product import");
            System.out.println("2. Delete product Export");
            System.out.println("Your selection: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    productImport.delete();
                    break out;
                case 2:
                    productExport.delete();
                    break out;
            }
        }
    }

    public static void viewProduct(){
        out:
        while (true){
            System.out.println("1. Display Product import");
            System.out.println("2. Display product Export");
            System.out.println("Your selection: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    productImport.displayProduct();
                    break out;
                case 2:
                    productExport.displayProduct();
                    break out;
            }
        }
    }

    public static void findProduct() throws NotFoundProductException {
        out:
        while (true){
            System.out.println("1. Find Product import");
            System.out.println("2. Find product Export");
            System.out.println("Your selection: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    productImport.findProduct();
                    break out;
                case 2:
                    productExport.findProduct();
                    break out;
            }
        }
    }

    public static void main(String[] args) throws NotFoundProductException {
        displayMenu();
    }
}
