package models;

public class Villa extends Facility{
    private int roomStandard;//Tieu chuan pohng 
    private double lakeArea;//Dien tich ho boi 
    private int numberFloors;//So ta`ng
    
    public Villa(){}

    public Villa(int roomStandard, double lakeArea, int numberFloors){
        this.roomStandard = roomStandard;
        this.lakeArea = lakeArea;
        this.numberFloors = numberFloors;
    }

    public Villa(String serviceName, double usableArea, double rentalCosts, int maxPeople, String styleCosts,
            int roomStandard, double lakeArea, int numberFloors) {
        super(serviceName, usableArea, rentalCosts, maxPeople, styleCosts);
        this.roomStandard = roomStandard;
        this.lakeArea = lakeArea;
        this.numberFloors = numberFloors;
    }

    public int getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(int roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getLakeArea() {
        return lakeArea;
    }

    public void setLakeArea(double lakeArea) {
        this.lakeArea = lakeArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    
}
