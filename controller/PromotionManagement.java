package controller;

import java.util.Scanner;

public class PromotionManagement {
    public void displayFacility() {
        boolean flag = true;
        System.out.println("1. Display list customers use service\n" +
                "2. display list customers get voucher\n" +
                "3.return main menu");
        do {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.println("moi nhap lai");
                    break;
            }
        } while (flag);
    }
}
