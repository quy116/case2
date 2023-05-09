package controller;

import service.facility_service.FacilitySv;

import java.util.Scanner;

public class FacilityManagement {
    public void displayFacility () {
        boolean flag = true;
        FacilitySv facilitySv = new FacilitySv();
        do {
            System.out.println("1. Display list Facility\n" +
                    "2. Add new Facility\n" +
                    "3. Edit Facility\n" +
                    "4. Return main menu");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    facilitySv.display();
                    break;
                case "2":
                    facilitySv.addVilla();
                    break;
                case "3":
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
