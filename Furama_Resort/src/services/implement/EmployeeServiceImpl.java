package services.implement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Employee;
import services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
    static List<Employee> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee : list) {
            System.out.println(employee.toString());
        }
    }
    @Override
    public void add() {
        System.out.println("Enter id: ");
        int idEmployee = scanner.nextInt();
        System.out.println("Enter name: ");
        String  name = scanner.nextLine();
        System.out.println("Enter date: ");
        String date = scanner.nextLine();
        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter identify card numbers: ");
        int numberIdentify = scanner.nextInt();
        System.out.println("Enter phone number: ");
        int phoneNumbers = scanner.nextInt();
        System.err.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter level: ");
        String level = scanner.nextLine();
        System.out.println("Enter Position: ");
        String position = scanner.nextLine();
        System.out.println("Enter salaried: ");
        double salaried = scanner.nextDouble();

        Employee employee = new Employee(idEmployee, name, date, gender, numberIdentify, phoneNumbers, email, level, position, salaried);
        list.add(employee);
        System.out.println("Add complete !");
    }
    @Override
    public void edit() {
        System.out.println("Enter id employ you want to edit: ");
        int id = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if(id == i){
                System.out.println("Enter name: ");
                String  name = scanner.nextLine();
                System.out.println("Enter date: ");
                String date = scanner.nextLine();
                System.out.println("Enter gender: ");
                String gender = scanner.nextLine();
                System.out.println("Enter identify card numbers: ");
                int numberIdentify = scanner.nextInt();
                System.out.println("Enter phone number: ");
                int phoneNumbers = scanner.nextInt();
                System.err.println("Enter email: ");
                String email = scanner.nextLine();
                System.out.println("Enter level: ");
                String level = scanner.nextLine();
                System.out.println("Enter Position: ");
                String position = scanner.nextLine();
                System.out.println("Enter salaried: ");
                double salaried = scanner.nextDouble();
                Employee employeeNew = new Employee(id, name, date, gender, numberIdentify, phoneNumbers, email, level, position, salaried);
                list.set(id, employeeNew);
                System.out.println("Edit complete!");
            }
        }

        
    }
}
