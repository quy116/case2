package model.service;

public class Booking {
    private String codeBooking;
    private String dayBooking;
    private String startDayBooking;
    private String endDayBooking;
    private String codeCustomer;
    private String codeSv;

    public Booking() {
    }

    public Booking(String codeBooking, String dayBooking, String startDayBooking, String endDayBooking, String codeCustomer, String codeSv) {
        this.codeBooking = codeBooking;
        this.dayBooking = dayBooking;
        this.startDayBooking = startDayBooking;
        this.endDayBooking = endDayBooking;
        this.codeCustomer = codeCustomer;
        this.codeSv = codeSv;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getDayBooking() {
        return dayBooking;
    }

    public void setDayBooking(String dayBooking) {
        this.dayBooking = dayBooking;
    }

    public String getStartDayBooking() {
        return startDayBooking;
    }

    public void setStartDayBooking(String startDayBooking) {
        this.startDayBooking = startDayBooking;
    }

    public String getEndDayBooking() {
        return endDayBooking;
    }

    public void setEndDayBooking(String endDayBooking) {
        this.endDayBooking = endDayBooking;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getCodeSv() {
        return codeSv;
    }

    public void setCodeSv(String codeSv) {
        this.codeSv = codeSv;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBooking='" + codeBooking + '\'' +
                ", dayBooking='" + dayBooking + '\'' +
                ", startDayBooking='" + startDayBooking + '\'' +
                ", endDayBooking='" + endDayBooking + '\'' +
                ", codeCustomer='" + codeCustomer + '\'' +
                ", codeSv='" + codeSv + '\'' +
                '}';
    }
}
