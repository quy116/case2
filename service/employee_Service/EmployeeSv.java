package service.employee_Service;

import model.person.Employee;
import repository.employee_repository.EmployeeRepository;
import untill.ReadAndWrite;
import validate.EmployeeValidate;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeSv implements IEmployeeSv {
    Scanner sc = new Scanner(System.in);
    EmployeeValidate employeeValidate = new EmployeeValidate();
    EmployeeRepository employeeRepository = new EmployeeRepository();
    //    super(code, name, dayAndBirth, gender, id, phoneNumber, email, address);
    static String PATH = "src/data/employee.csv";


    @Override
    public void display() {
        employeeRepository.displayRepo();

    }

    @Override
    public void add() {
        String inputCode;
        do {
            System.out.println("nhập mã nhân viên");
            inputCode = sc.nextLine();
        }while (!employeeValidate.checkCode(inputCode));
        String inputName;
        do {
            System.out.println("nhập tên nhân viên");
            inputName = sc.nextLine();
        }while (!employeeValidate.checkName(inputName));

        String inputday;
        do {
            System.out.println("nhập ngày tháng năm sinh nhân viên");
            inputday = sc.nextLine();
        }while (!employeeValidate.checkAge(inputday));

        System.out.println("nhập giới tính nhân viên");
        String inputGender = sc.nextLine();

        String inputId;
        do {
            System.out.println("nhập id vào nhân viên");
            inputId = sc.nextLine();
        }while (!employeeValidate.checkId(inputId));

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


        Employee employee = new Employee(inputCode, inputName, inputday, inputGender, inputId, inputPhone, inputgmail, inputaddress, inputLevel, inputPosititon, inputSarary);
        employeeRepository.addrepo(employee);
    }

    @Override
    public void edit() {
        System.out.println("nhap id nguoi can sua");
        String inputEdit = sc.nextLine();
        employeeRepository.eidtRepo(inputEdit);

    }
}
