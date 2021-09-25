package models;

public class Booking extends Facility {
    
    private int bookingCode;//ma booking
    private String startDate;//Ngay bat dau
    private String endDate;//Ngay ket thuc
    
    public Booking() {
    }

    public Booking(int bookingCode, String startDate, String endDate) {
        this.bookingCode = bookingCode;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Booking(int bookingCode2) {
        this.bookingCode = bookingCode2;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    Customer customer = new Customer();
    @Override
    public String toString() {
        return "Booking: {Booking Code :"+bookingCode+
                        " Start Date   :"+startDate +
                        " End Date     :"+endDate+
                        " Customer id  :"+customer.getId()+
                        " Service Name :"+getServiceName()+"}";
    }
}
