package models;

public abstract class Person {
    private int id;
    private String name;
    private String date;
    private String gender;
    private int identityCardNumber;
    private int phoneNumbers;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String date, String gender, int identityCardNumber, int phoneNumbers, String email) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumbers = phoneNumbers;
        this.email = email;
    }
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public int getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(int phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person {" +
                "This id: " + id +
                "\nThis name: " + name + 
                "\nThis Date: " + date +
                "\nThis Gender: " + gender +
                "\nIndentify card: " +identityCardNumber +
                "\nThis Email: " + email +
                "\nPhone numbers: " + phoneNumbers;
    }
}
