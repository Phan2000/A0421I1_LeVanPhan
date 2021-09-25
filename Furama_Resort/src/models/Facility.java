package models;

public abstract class Facility {

    private String serviceName;//Ten dich vu
    private double usableArea;//Dien tich su dung
    private double rentalCosts;//Chi phi thue
    private int maxPeople;//So luong nguoi toi da
    private String styleCosts;//Kieu thue

    public Facility() {
    }

    public Facility(String serviceName, double usableArea, double rentalCosts, int maxPeople, String styleCosts) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maxPeople = maxPeople;
        this.styleCosts = styleCosts;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getStyleCosts() {
        return styleCosts;
    }

    public void setStyleCosts(String styleCosts) {
        this.styleCosts = styleCosts;
    }
}
