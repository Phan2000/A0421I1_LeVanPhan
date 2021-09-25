package models;

public class Customer extends Person{
    private String customerType; //Loai khach hang
    private String address; //Dia chi

    public Customer() {
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(int id, String name, String date, String gender, int identityCardNumber, int phoneNumbers, String email, String customerType, String address) {
        super(id, name, date, gender, identityCardNumber, phoneNumbers, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getaddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{ This customer type : "+customerType+
                       "\nAddress customer : "+address+
                        super.toString();
    }
}
