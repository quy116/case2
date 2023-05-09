package model.person;

public class Employee extends Person {
    private String level;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(String code, String name, String dayAndBirth, String gender, String id, String phoneNumber, String email, String address, String level, String position, String salary) {
        super(code, name, dayAndBirth, gender, id, phoneNumber, email, address);
        this.level = level;
        this.position = position;
        this.salary = salary;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String getinfoEmloyeToCsv() {
        return super.getCode() + "," + super.getName() + "," + super.getDayAndBirth() + "," + super.getDayAndBirth() + "," + super.getGender() + "," + super.getId() + "," + super.getPhoneNumber() + "," + super.getEmail() + "," + super.getAddress() + "," + this.level + "," +this.position+ "," +this.salary;
    }
}
