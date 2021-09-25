package thi_thuc_hanh_module2.product;

public abstract class Products {
    private int id;
    private int productCode;
    private String nameProduct;
    private double price;
    private  int amount;
    private  String origin;

    public Products() {
    }


    public Products(int id, int productCode, String nameProduct, double price, int amount, String origin) {
        this.id = id;
        this.productCode = productCode;
        this.nameProduct = nameProduct;
        this.price = price;
        this.amount = amount;
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", productCode=" + productCode +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", origin='" + origin + '\'' +
                '}';
    }

    public abstract void addNew();
    public abstract void delete();
    public abstract void displayProduct();
    public abstract void findProduct() throws NotFoundProductException;

}
