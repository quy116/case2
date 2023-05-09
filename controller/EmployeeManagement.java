package controller;

import service.employee_Service.EmployeeSv;

import java.util.Scanner;

public class EmployeeManagement {
    EmployeeSv employeeSv = new EmployeeSv();

    public void displayEmployee() {

        boolean flag = true;
        do {
            System.out.println("1. Display list employees\n" +
                    "2. Add new employess\n" +
                    "3. Edit employess\n" +
                    "4. Return main menu");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    employeeSv.display();
                    break;
                case "2":
                    employeeSv.add();
                    break;
                case "3":
                    employeeSv.edit();
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
