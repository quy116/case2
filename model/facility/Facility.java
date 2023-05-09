package model.facility;

public class Facility {
    private String codeSv;
    private String nameSv;
    private String areaSv;
    private String moneySv;
    private String maxPeopleSv;
    private String daySv;
    private String roomSv;
    private String floorSv;

    public Facility() {
    }

    public Facility(String codeSv, String nameSv, String areaSv, String moneySv, String maxPeopleSv, String daySv, String roomSv, String floorSv) {
        this.codeSv = codeSv;
        this.nameSv = nameSv;
        this.areaSv = areaSv;
        this.moneySv = moneySv;
        this.maxPeopleSv = maxPeopleSv;
        this.daySv = daySv;
        this.roomSv = roomSv;
        this.floorSv = floorSv;
    }

    public String getCodeSv() {
        return codeSv;
    }

    public void setCodeSv(String codeSv) {
        this.codeSv = codeSv;
    }

    public String getNameSv() {
        return nameSv;
    }

    public void setNameSv(String nameSv) {
        this.nameSv = nameSv;
    }

    public String getAreaSv() {
        return areaSv;
    }

    public void setAreaSv(String areaSv) {
        this.areaSv = areaSv;
    }

    public String getMoneySv() {
        return moneySv;
    }

    public void setMoneySv(String moneySv) {
        this.moneySv = moneySv;
    }

    public String getMaxPeopleSv() {
        return maxPeopleSv;
    }

    public void setMaxPeopleSv(String maxPeopleSv) {
        this.maxPeopleSv = maxPeopleSv;
    }

    public String getDaySv() {
        return daySv;
    }

    public void setDaySv(String daySv) {
        this.daySv = daySv;
    }

    public String getRoomSv() {
        return roomSv;
    }

    public void setRoomSv(String roomSv) {
        this.roomSv = roomSv;
    }

    public String getFloorSv() {
        return floorSv;
    }

    public void setFloorSv(String floorSv) {
        this.floorSv = floorSv;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "codeSv='" + codeSv + '\'' +
                ", nameSv='" + nameSv + '\'' +
                ", areaSv='" + areaSv + '\'' +
                ", moneySv='" + moneySv + '\'' +
                ", maxPeopleSv='" + maxPeopleSv + '\'' +
                ", daySv='" + daySv + '\'' +
                ", roomSv='" + roomSv + '\'' +
                ", floorSv='" + floorSv + '\'' +
                '}';
    }
}
