package repository.employee_repository;

import model.person.Employee;
import untill.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static untill.ReadAndWrite.writeProduct;

public class EmployeeRepository implements IEmployeeRepository {
    Scanner sc = new Scanner(System.in);
    ReadAndWrite readAndWrite = new ReadAndWrite();
    static String PATH = "src/data/employee.csv";
    static List<Employee> employeeList = new ArrayList<>();
    static {
        Employee employee = new Employee("001", "Trung", "1993", "nu", "13213123123", "0905131836", "nguyenquy1106@gmail.com", "da nang", "inter", "don nha vs", "10000");
        employeeList.add(employee);
        ReadAndWrite.writeProduct(employeeList,PATH);
    }
    @Override
    public void displayRepo() {
        readAndWrite.readEmployeeListFromFile(PATH);
        for (Employee e: employeeList) {
            System.out.println(e);
        }
        }

    @Override
    public void eidtRepo(String edit) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (edit.equals(employeeList.get(i).getCode())){
                System.out.println("nhập mã nhân viên");
                String inputCode = sc.nextLine();

                System.out.println("nhập tên nhân viên");
                String inputName = sc.nextLine();

                System.out.println("nhập ngày tháng năm sinh nhân viên");
                String inputday = sc.nextLine();

                System.out.println("nhập giới tính nhân viên");
                String inputGender = sc.nextLine();

                System.out.println("nhập id vào nhân viên");
                String inputId = sc.nextLine();

                System.out.println("nhập số điện thoại nhân viên");
                String inputPhone = sc.nextLine();

                System.out.println("nhập gmail nhân viên");
                String inputgmail = sc.nextLine();

                System.out.println("nhập địa chỉ nhân viên");
                String inputaddress = sc.nextLine();


                System.out.println("nhập lương nhân viên");
                String inputSarary = sc.nextLine();

                System.out.println("nhập trình độ nhân viên");
                String inputLevel = sc.nextLine();

                System.out.println("nhập vị trí  nhân viên");
                String inputPosititon = sc.nextLine();
                employeeList.get(i).setCode(inputCode);
                employeeList.get(i).setName(inputName);
                employeeList.get(i).setDayAndBirth(inputday);
                employeeList.get(i).setGender(inputGender);
                employeeList.get(i).setId(inputId);
                employeeList.get(i).setPhoneNumber(inputPhone);
                employeeList.get(i).setEmail(inputgmail);
                employeeList.get(i).setAddress(inputaddress);
                employeeList.get(i).setSalary(inputSarary);
                employeeList.get(i).setLevel(inputLevel);
                employeeList.get(i).setPosition(inputPosititon);
            } else{
                System.out.println("khoong tim thay");
            }
        }
    }


    @Override
    public void addrepo(Employee employees) {
        employeeList.add((Employee) employees);
        ReadAndWrite.writeProduct(employeeList,PATH);
    }
}
