package models;

public class Employee extends Person{
    private String level;//trinh do
    private String position;//chuc vu
    private double salaried;//Luong bong

    public Employee() {
    }

    public Employee(String level, String position, double salaried) {
        this.level = level;
        this.position = position;
        this.salaried = salaried;
    }

    public Employee(int id, String name, String date, String gender, int identityCardNumber, int phoneNumbers, String email, String level, String position, double salaried) {
        super(id, name, date, gender, identityCardNumber, phoneNumbers, email);
        this.level = level;
        this.position = position;
        this.salaried = salaried;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalaried(){
        return salaried;
    }

    public void setSalaried(double salaried){
        this.salaried = salaried;
    }

    @Override
    public String toString() {
        return "Employee{  This lever: "+level+
                        "\nThis position: "+position+
                        "\nThis salaried: "+salaried+
                        super.toString();
    }
}
