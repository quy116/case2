package repository.facility_repository;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import model.person.Employee;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    static Map<Facility, Integer> map = new LinkedHashMap();

    //    public House(String codeSv, String nameSv, String areaSv, String moneySv, String maxPeopleSv, String daySv, String roomSv, String floorSv) {
    //        super(codeSv, nameSv, areaSv, moneySv, maxPeopleSv, daySv, roomSv, floorSv);
    static {
        House house = new House("001", "tong thong", "100m2", "5000", "4", "10/4/2023", "103", "1");
        map.put(house, 0);

    }


    @Override
    public void addVilla(Villa villa) {
        map.put(villa, 0);
    }

    @Override
    public void addHouse(House house) {
        map.put(house,0);
    }

    @Override
    public void addRoom(Room room) {
        map.put(room,0);
    }


    @Override
    public void addNewHouse(House house) {

    }



    @Override
    public Map<Facility, Integer> display() {
        return map;
    }
}
