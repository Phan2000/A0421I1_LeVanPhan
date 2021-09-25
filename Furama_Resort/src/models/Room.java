package models;

public class Room extends Facility{
    private String freeService;//Dich vu mien phi

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, double usableArea, double rentalCosts, int maxPeople, String styleCosts,
            String freeService) {
        super(serviceName, usableArea, rentalCosts, maxPeople, styleCosts);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
