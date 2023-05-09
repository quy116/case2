package service.facility_service;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import repository.facility_repository.FacilityRepository;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilitySv implements IFacilitySv{
    FacilityRepository repository = new FacilityRepository();
    Scanner sc = new Scanner(System.in);
    Map<Facility, Integer> map = repository.display();
    @Override
    public void display() {
    map = repository.display();
        Set<Facility> facilities = map.keySet();
        for (Facility e:facilities) {
            System.out.println(e);
        }
    }

    @Override
    public void addVilla() {
        System.out.println("nhap code vao");
        String inputCode = sc.nextLine();
        System.out.println("nhap name dv vao");
        String inputName = sc.nextLine();
        System.out.println("nhap dien tich dv vao");
        String inpuArea = sc.nextLine();
        System.out.println("nhap gia tien dv vao");
        String inpuMoney = sc.nextLine();
        System.out.println("nhap so nguoi vao");
        String inputPeople = sc.nextLine();
        System.out.println("nhap day vao");
        String inputDay = sc.nextLine();
        System.out.println("nhap so phong vao");
        String inputRoom = sc.nextLine();
        System.out.println("nhap tang vao");
        String inputFloor = sc.nextLine();
        System.out.println("nhap dien tich ho boi vao");
        String inputPool = sc.nextLine();
        Villa villa = new Villa(inputCode,inputName,inpuArea,inpuMoney,inputPeople,inputDay,inputRoom,inputFloor,inputPool);
        repository.addVilla(villa);
    }

    @Override
    public void addHouse() {
        System.out.println("nhap code vao");
        String inputCode = sc.nextLine();
        System.out.println("nhap name dv vao");
        String inputName = sc.nextLine();
        System.out.println("nhap dien tich dv vao");
        String inpuArea = sc.nextLine();
        System.out.println("nhap gia tien dv vao");
        String inpuMoney = sc.nextLine();
        System.out.println("nhap so nguoi vao");
        String inputPeople = sc.nextLine();
        System.out.println("nhap day vao");
        String inputDay = sc.nextLine();
        System.out.println("nhap so phong vao");
        String inputRoom = sc.nextLine();
        System.out.println("nhap tang vao");
        String inputFloor = sc.nextLine();
        House house = new House(inputCode,inputName,inpuArea,inpuMoney,inputPeople,inputDay,inputRoom,inputFloor);
        repository.addHouse(house);
    }

    @Override
    public void addRoom() {
        System.out.println("nhap code vao");
        String inputCode = sc.nextLine();
        System.out.println("nhap name dv vao");
        String inputName = sc.nextLine();
        System.out.println("nhap dien tich dv vao");
        String inputArea = sc.nextLine();
        System.out.println("nhap gia tien dv vao");
        String inpuMoney = sc.nextLine();
        System.out.println("nhap so nguoi vao");
        String inputPeople = sc.nextLine();
        System.out.println("nhap day vao");
        String inputDay = sc.nextLine();
        System.out.println("nhap dv free vao");
        String inputFree = sc.nextLine();
        System.out.println("nhap so phong vao");
        String inputRoom = sc.nextLine();
        System.out.println("nhap tang vao");
        String inputFloor = sc.nextLine();
        Room room = new Room(inputCode,inputName,inputArea,inpuMoney,inputPeople,inputDay,inputRoom,inputFloor,inputFree);
        repository.addRoom(room);
    }

    @Override
    public void edit() {

    }
}
