package model.person;

public class Customer extends Person {
    private String typeCustommer;

    public Customer() {
    }

    public Customer(String code, String name, String dayAndBirth, String gender, String id, String phoneNumber, String email, String address, String typeCustommer) {
        super(code, name, dayAndBirth, gender, id, phoneNumber, email, address);
        this.typeCustommer = typeCustommer;
    }

    public String getTypeCustommer() {
        return typeCustommer;
    }

    public void setTypeCustommer(String typeCustommer) {
        this.typeCustommer = typeCustommer;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "typeCustommer='" + typeCustommer + '\'' +
                '}';
    }

    public String getCustomToCsv() {
        return super.getCode() + "," + super.getName() + "," + super.getDayAndBirth() + "," + super.getDayAndBirth() + "," + super.getGender() + "," + super.getId() + "," + super.getPhoneNumber() + "," + super.getEmail() + "," + super.getAddress() + "," + this.typeCustommer;
    }
}

