package model.person;

public abstract class Person {
    private String Code;
    private String name;
    private String dayAndBirth;
    private String gender;
    private String id;
    private String phoneNumber;
    private String email;
    private String address;

    public Person() {
    }

    public Person(String code, String name, String dayAndBirth, String gender, String id, String phoneNumber, String email, String address) {
        Code = code;
        this.name = name;
        this.dayAndBirth = dayAndBirth;
        this.gender = gender;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayAndBirth() {
        return dayAndBirth;
    }

    public void setDayAndBirth(String dayAndBirth) {
        this.dayAndBirth = dayAndBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Person{" +
                "Code='" + Code + '\'' +
                ", name='" + name + '\'' +
                ", dayAndBirth='" + dayAndBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
