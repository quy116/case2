package model.facility;

import model.facility.Facility;

public class Room extends Facility {
    private String freeSv;

    public Room() {
    }

    public Room(String codeSv, String nameSv, String areaSv, String moneySv, String maxPeopleSv, String daySv, String roomSv, String floorSv, String freeSv) {
        super(codeSv, nameSv, areaSv, moneySv, maxPeopleSv, daySv, roomSv, floorSv);
        this.freeSv = freeSv;
    }

    public String getFreeSv() {
        return freeSv;
    }

    public void setFreeSv(String freeSv) {
        this.freeSv = freeSv;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeSv='" + freeSv + '\'' +
                '}';
    }
}
