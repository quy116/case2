package repository.customer_repository;

import model.person.Customer;
import untill.WriteAndRadCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerRepository implements ICustomerRepository {
    Scanner sc = new Scanner(System.in);
    static String PATH = "src/data/customer.csv";
    static List<Customer> customerList = new ArrayList<>();
    static {
        Customer customer = new Customer("001","Quy","11/06/2000","nam", "123123123", "0787240647","nguyenphucquy1106@gmail.com","quang nam","kim cuong");
        customerList.add(customer);
        WriteAndRadCustomer.writeProduct(customerList,PATH);
    }

    @Override
    public void addrepo(Customer customer) {
        customerList.add(customer);
        WriteAndRadCustomer.writeProduct(customerList,PATH);
    }

    @Override
    public void displayRepo() {
        WriteAndRadCustomer.readCustomer(PATH);
        for (Customer e: customerList) {
            System.out.println(e);
        }
    }

    @Override
    public void eidtRepo(String edit) {
        for (int i = 0; i < customerList.size() ; i++) {
            if (edit.equals(customerList.get(i).getCode())){
                System.out.println("nhập mã khách hàng");
                String inputCode = sc.nextLine();

                System.out.println("nhập tên khách hàng");
                String inputName = sc.nextLine();

                System.out.println("nhập ngày tháng năm sinh khách hàng");
                String inputday = sc.nextLine();

                System.out.println("nhập giới tính khách hàng");
                String inputGender = sc.nextLine();

                System.out.println("nhập id khách hàng");
                String inputId = sc.nextLine();

                System.out.println("nhập số điện thoại khách hàng");
                String inputPhone = sc.nextLine();

                System.out.println("nhập gmail khách hàng");
                String inputgmail = sc.nextLine();

                System.out.println("nhập địa chỉ khách hàng");
                String inputaddress = sc.nextLine();

                System.out.println("nhập độ dân chơi của khách hàng");
                String inputType = sc.nextLine();

                customerList.get(i).setCode(inputCode);
                customerList.get(i).setName(inputName);
                customerList.get(i).setDayAndBirth(inputday);
                customerList.get(i).setGender(inputGender);
                customerList.get(i).setId(inputId);
                customerList.get(i).setPhoneNumber(inputPhone);
                customerList.get(i).setEmail(inputgmail);
                customerList.get(i).setAddress(inputaddress);
                customerList.get(i).setTypeCustommer(inputType);
            } else {
                System.out.println("không tìm thấy");
            }
        }
    }

}
