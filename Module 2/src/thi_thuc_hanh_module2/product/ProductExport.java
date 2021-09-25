package thi_thuc_hanh_module2.product;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ProductExport extends Products{
    private double exportPrice;
    private String country;

    Scanner scanner = new Scanner(System.in);
    List<ProductExport> listProduct = new ArrayList<>();

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
        double priceExport = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter country export: ");
        String country = scanner.nextLine();
        ProductExport productExport = new ProductExport(id, productCode, name, price, amount, origin, priceExport, country);
        listProduct.add(productExport);
        System.out.println("Add complete!");

        try {
            FileOutputStream fos = new FileOutputStream("F:\\A0421I1_LeVanPhan\\Module 2\\src\\" +
                    "thi_thuc_hanh_module2\\data\\ExportProduct.csv");
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
        System.out.println("Enter your id you want to delete :");
        int id = scanner.nextInt();
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == i){
                listProduct.remove(id);
                System.out.println("Remove complete");
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream("F:\\A0421I1_LeVanPhan\\Module 2\\src\\" +
                    "thi_thuc_hanh_module2\\data\\ExportProduct.csv");
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
        for (ProductExport product : listProduct) {
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

    public ProductExport(){

    }

    public ProductExport(double exportPrice, String country) {
        this.exportPrice = exportPrice;
        this.country = country;
    }

    public ProductExport(int id, int productCode, String nameProduct, double price, int amount, String origin, double exportPrice, String country) {
        super(id, productCode, nameProduct, price, amount, origin);
        this.exportPrice = exportPrice;
        this.country = country;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ProductExport{" +
                "exportPrice=" + exportPrice +
                ", country='" + country + '\'' +
                super.toString()+
                '}';
    }
}
