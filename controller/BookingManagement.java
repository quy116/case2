package controller;

import java.util.Scanner;

public class BookingManagement {
    public void displayBooking() {
        boolean flag = true;
        System.out.println("1. Display list Booking\n" +
                "2.Display list contracts\n" +
                "3. Edit Facility\n" +
                "4. Creat new contracts\n" +
                "5.add new booking \n" +
                "6. Return main menu");
        do {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "5":
                   break;
                case "6":
                    flag = false;
                    break;
                default:
                    System.out.println("moi nhap lai");
                    break;
            }
        } while (flag);
    }
}
