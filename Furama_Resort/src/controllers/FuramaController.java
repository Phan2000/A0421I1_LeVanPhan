package controllers;

import java.util.Scanner;
import services.implement.CustomerServiceImpl;
import services.implement.EmployeeServiceImpl;
import services.implement.FacilityServiceImpl;

public class FuramaController {
    
    static Scanner scanner = new Scanner(System.in);
    private static void displayMainMenu(){
        int choice;
        while(true) {
            System.out.println("Main menu :");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    System.out.println("1. Add new booking");
                    System.out.println("2. Display list booking");
                    System.out.println("3. Create new contracts");
                    System.out.println("4. Display list contracts");
                    System.out.println("5. Edit contracts");
                    System.out.println("6. Return main menu");
                    choice = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return main menu");
                    choice = scanner.nextInt();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }

    static EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
    static CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
    static FacilityServiceImpl facilityServiceImpl = new FacilityServiceImpl();
    public static void employeeManagement(){
        out:
        while(true){   
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            switch (choice) {
            case 1:
                employeeServiceImpl.display();       
                break;
            case 2:
                employeeServiceImpl.add();
                break;
            case 3:
                employeeServiceImpl.edit();
                break;
            case 4:
                break out;   
            }
        }
    }
    public static void customerManagement(){
        out:
        while (true) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            int choice = scanner.nextInt();
            
            switch(choice){
                case 1:
                    customerServiceImpl.display();
                    break;
                case 2:
                    customerServiceImpl.add();
                    break;
                case 3:
                    customerServiceImpl.edit();
                    break;
                case 4:
                    break out;
            }
        }
    }
    public static void facilityManagement(){
        out:
        while(true){
            System.out.println("1. Display list facility\n");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            int choice = scanner.nextInt();
            switch(choice){
                case 1: 
                    facilityServiceImpl.display();
                    break;
                case 2:
                    addNew();
                    break;
                case 3: 
                    facilityServiceImpl.displayMaintain();
                    break;
                case 4:
                    break out;
            }
        }
    }
    public static void addNew(){
        while(true){
            System.out.println("1. Add new House");
            System.out.println("2. Add new Villa");
            System.out.println("3. Add new Room");
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    facilityServiceImpl.addHouse();
                    break;
                case 2:
                    facilityServiceImpl.addVilla();
                    break;
                case 3:
                    facilityServiceImpl.addRoom();
                    break;
            }
        }
    }
    public static void main(String[] args) {
        displayMainMenu();
    }
}
