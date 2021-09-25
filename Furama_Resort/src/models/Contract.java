package models;

public class Contract{
    private int numberOfContract;//So hop dong
    private double deposits;//Tien dat coc
    private double totalMoney;//Tong tien thanh toan

    public Contract() {
    }

    public Contract(int numberOfContract, double deposits, double totalMoney, int customer, Booking booking) {
        this.numberOfContract = numberOfContract;
        this.deposits = deposits;
        this.totalMoney = totalMoney;
    }

    public int getNumberOfContract() {
        return numberOfContract;
    }
    public void setNumberOfContract(int numberOfContract) {
        this.numberOfContract = numberOfContract;
    }
    public double getDeposits() {
        return deposits;
    }
    public void setDeposits(double deposits) {
        this.deposits = deposits;
    }
    public double getTotalMoney() {
        return totalMoney;
    }
    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }
}
