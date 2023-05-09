package model.facility;

import model.facility.Facility;

public class Villa extends Facility {
    private String poolArea;

    public Villa() {
    }

    public Villa(String codeSv, String nameSv, String areaSv, String moneySv, String maxPeopleSv, String daySv, String roomSv, String floorSv, String poolArea) {
        super(codeSv, nameSv, areaSv, moneySv, maxPeopleSv, daySv, roomSv, floorSv);
        this.poolArea = poolArea;
    }


    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "poolArea='" + poolArea + '\'' +
                '}';
    }
}
