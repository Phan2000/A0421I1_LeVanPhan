package thi_thuc_hanh_module2.product;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImport extends Products {
    Scanner scanner = new Scanner(System.in);
    private double priceImport;
    private String country;
    private int importTax;

    List<ProductImport> listProduct = new ArrayList<>();
    @Override
    public void addNew() {
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product code: ");
        int productCode = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name product: ");
        String name = scanner.nextLine();
        System.out.println("Enter Price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter amount: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter origin: ");
        String origin = scanner.nextLine();
        System.out.println("Enter price import: ");
        double priceImport = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter country export: ");
        String country = scanner.nextLine();
        System.out.println("Enter import Tax : ");
        int tax = Integer.parseInt(scanner.nextLine());

        ProductImport productImport = new ProductImport(id, productCode, name, price, amount, origin, priceImport, country, tax);

        listProduct.add(productImport);
        System.out.println("Add product complete!");

        try {
            FileOutputStream fos = new FileOutputStream("F:\\A0421I1_LeVanPhan\\Module 2\\src\\" +
                    "thi_thuc_hanh_module2\\data\\ImportProduct.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listProduct);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter ID you want to delete:");
        int id = scanner.nextInt();

        for (int i = 0; i < listProduct.size(); i++) {
            if(id == i){
                listProduct.remove(id);
                System.out.println("Remove product complete!");
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream("F:\\A0421I1_LeVanPhan\\Module 2\\src\\" +
                    "thi_thuc_hanh_module2\\data\\ImportProduct.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listProduct);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayProduct() {
        for (ProductImport product:listProduct) {
            System.out.println(product.toString());
        }
    }

    @Override
    public void findProduct() throws NotFoundProductException{
        System.out.println("Enter id product you want to find: ");
        int id = scanner.nextInt();
        for (int i = 0; i < listProduct.size(); i++) {
            if(id == i) {
                System.out.println(listProduct.get(id));
            }
            else {
                throw new NotFoundProductException("Not found!");
            }
        }
    }

    public ProductImport(){}

    public ProductImport(double priceImport, String country, int importTax) {
        this.priceImport = priceImport;
        this.country = country;
        this.importTax = importTax;
    }

    public ProductImport(int id, int productCode, String nameProduct, double price, int amount, String origin, double priceImport, String country, int importTax) {
        super(id, productCode, nameProduct, price, amount, origin);
        this.priceImport = priceImport;
        this.country = country;
        this.importTax = importTax;
    }

    public double getPriceImport() {
        return priceImport;
    }

    public void setPriceImport(double priceImport) {
        this.priceImport = priceImport;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getImportTax() {
        return importTax;
    }

    public void setImportTax(int importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return "ProductImport{" +
                ", priceImport=" + priceImport +
                ", country='" + country + '\'' +
                ", importTax=" + importTax +
                super.toString()+
                '}';
    }
}
