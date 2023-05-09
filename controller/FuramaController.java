package controller;

import java.util.Scanner;

public class FuramaController {

    public static void displayMainMenu(){
        EmployeeManagement employeeManagement = new EmployeeManagement();
        PromotionManagement promotionManagement = new PromotionManagement();
        FacilityManagement facilityManagement = new FacilityManagement();
        CustomerManagement customerManagement = new CustomerManagement();
        BookingManagement bookingManagement = new BookingManagement();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("1. Employee Management \n" +
                "2. Customer Management\n" +
                "3. Facility Management \n" +
                "4. Booking Management \n" +
                "5. Promotiton Management \n" +
                "6. exit ");
        do {
            String input = sc.nextLine();
            switch (input){
                case "1":
                    employeeManagement.displayEmployee();
                    break;
                case "2":
                    customerManagement.displayCustomer();
                    break;
                case "3":
                    facilityManagement.displayFacility();
                    break;
                case "4":
                    bookingManagement.displayBooking();
                    break;
                case "5":
                    promotionManagement.displayFacility();
                    break;
                case "6":
                    flag= false;
                    break;
                default:
                    System.out.println("moi nhap lai");

            }
        }while (flag);

    }
}
