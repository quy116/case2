package controller;

import service.customer_Service.CustomerSv;

import java.util.Scanner;

public class CustomerManagement {
    public void displayCustomer() {
        CustomerSv customerSv = new CustomerSv();
        boolean flag = true;
        do {
            System.out.println("1. Display list Customer\n" +
                    "2. Add new Customer\n" +
                    "3. Edit Customer\n" +
                    "4. Return main menu");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    customerSv.display();
                    break;
                case "2":
                    customerSv.add();
                    break;
                case "3":
                    customerSv.edit();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("moi nhap lai");
                    break;
            }
        } while (flag);
    }
}
