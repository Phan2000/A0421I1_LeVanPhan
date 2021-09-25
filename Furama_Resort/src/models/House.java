package models;

public class House extends Facility{

    private String roomStandard;//Tieu chuan phong
    private int numberFloors;//So ta`ng

    public House() {
    }

    public House(String roomStandard, int numberFloors) {
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public House(String serviceName, double usableArea, double rentalCosts, int maxPeople, String styleCosts,
            String roomStandard, int numberFloors) {
        super(serviceName, usableArea, rentalCosts, maxPeople, styleCosts);
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }
}
