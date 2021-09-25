package services.implement;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import models.Facility;
import models.House;
import services.FacilityService;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> listFacility = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addHouse() {
        System.out.print("Enter service name: ");
        String serviceName = scanner.nextLine();
        System.out.print("Enter usable area: ");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter rental Costs: ");
        double rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter max people: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter style Costs: ");
        String styleCosts = scanner.nextLine();
        System.out.print("Enter room standard: ");
        String roomStandard = scanner.nextLine();
        System.out.print("Enter number floor: ");
        int numberFloors = Integer.parseInt(scanner.nextLine());

        House house = new House(serviceName, usableArea, rentalCosts, maxPeople, styleCosts, roomStandard, numberFloors);
        listFacility.put(house, 0);
        System.out.println("Add complete!");
    }

    @Override
    public void addVilla() {
        
    }

    @Override
    public void addRoom() {
        
    }

    @Override
    public void displayMaintain() {
        
    }

    @Override
    public void display() {
        
    }

}