package service.customer_Service;

import model.person.Customer;
import repository.customer_repository.CustomerRepository;
import validate.CustomerValidate;
import validate.EmployeeValidate;

import java.util.Scanner;

public class CustomerSv implements ICustomer {
    Scanner sc = new Scanner(System.in);
    EmployeeValidate employeeValidate = new EmployeeValidate();
    CustomerValidate customerValidate = new CustomerValidate();
    CustomerRepository customerRepository = new CustomerRepository();
    static String PATH = "src/data/customer.csv";

    @Override
    public void display() {
        customerRepository.displayRepo();
    }

    @Override
    public void add() {
        String inputCode;
        do {
            System.out.println("nhập mã khách hàng");
            inputCode = sc.nextLine();
        } while (!customerValidate.checkCode(inputCode));


        String inputName;
        do {
            System.out.println("nhập tên khách hàng");
            inputName = sc.nextLine();
        } while (!customerValidate.checkName(inputName));


        String inputday;
        do {
            System.out.println("nhập ngày tháng năm sinh khách hàng");
            inputday = sc.nextLine();

        } while (!customerValidate.checkAge(inputday));


        System.out.println("nhập giới tính khách hàng");
        String inputGender = sc.nextLine();
        String inputId;
        do {
            System.out.println("nhập id khách hàng");
            inputId = sc.nextLine();
        } while (!customerValidate.checkId(inputId));

        String inputPhone;
        do {
            System.out.println("nhập số điện thoại khách hàng");
            inputPhone = sc.nextLine();
        } while (!customerValidate.checkNumber(inputPhone));


        System.out.println("nhập gmail khách hàng");
        String inputgmail = sc.nextLine();

        System.out.println("nhập địa chỉ khách hàng");
        String inputaddress = sc.nextLine();


        System.out.println("nhập độ dân chơi của khách hàng");
        String inpuType = sc.nextLine();
        Customer customer = new Customer(inputCode, inputName, inputday, inputGender, inputGender, inputPhone, inputgmail, inputaddress, inpuType);
        customerRepository.addrepo(customer);
    }

    @Override
    public void edit() {
        System.out.println("nhập mã khách hàng vào để tiến hành eidt");
        String inputEdit = sc.nextLine();
        customerRepository.eidtRepo(inputEdit);
    }
}
