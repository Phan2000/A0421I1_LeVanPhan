package services.implement;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import models.Customer;
import services.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    Scanner scanner = new Scanner(System.in);
    List<Customer> listCustomers = new LinkedList<>();

    @Override
    public void display() {
        for (Customer customer : listCustomers) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void add() {
        System.out.println("Enter id: ");
        int idCustomer = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String  name = scanner.nextLine();
        System.out.println("Enter date: ");
        String date = scanner.nextLine();
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter identify card numbers: ");
        int numberIdentify = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter phone number: ");
        int phoneNumbers = Integer.parseInt(scanner.nextLine());
        System.err.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter type of Customer: ");
        String typeCustomer = scanner.nextLine();
        System.out.println("Enter address of customer: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(idCustomer, name, date, gender, numberIdentify, phoneNumbers, email, typeCustomer, address);
        listCustomers.add(customer);
        System.out.println("Add Complete!");
    }

    @Override
    public void edit() {
        System.out.println("Enter id you want to edit: ");
        int id = scanner.nextInt();
        for (int i = 0; i < listCustomers.size(); i++) {
            if(id == i){
                System.out.println("Enter name: ");
                String  name = scanner.nextLine();
                System.out.println("Enter date: ");
                String date = scanner.nextLine();
                System.out.println("Enter gender: ");
                String gender = scanner.nextLine();
                System.out.println("Enter identify card numbers: ");
                int numberIdentify = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter phone number: ");
                int phoneNumbers = Integer.parseInt(scanner.nextLine());
                System.err.println("Enter email: ");
                String email = scanner.nextLine();
                System.out.println("Enter type of Customer: ");
                String typeCustomer = scanner.nextLine();
                System.out.println("Enter address of customer: ");
                String address = scanner.nextLine();

                Customer newCustomer = new Customer(id, name, date, gender, numberIdentify, phoneNumbers, email, typeCustomer, address);
                listCustomers.set(id, newCustomer);
                System.out.println("Edit complete");
            }
        }
        
    }   
}
