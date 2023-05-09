package repository.facility_repository;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import repository.IRepository;

import java.util.Map;

public interface IFacilityRepository {
    public void addVilla(Villa villa);
    public void addHouse(House house);
    public void addRoom(Room room);

    public void addNewHouse(House house);


    public Map<Facility, Integer> display();
}
