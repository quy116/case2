package model.service;

public class Contract {
    private String codeContract;
    private String codeBooking;
    private String firstNumberMoney;
    private String sumMoney;

    public Contract() {
    }

    public Contract(String codeContract, String codeBooking, String firstNumberMoney, String sumMoney) {
        this.codeContract = codeContract;
        this.codeBooking = codeBooking;
        this.firstNumberMoney = firstNumberMoney;
        this.sumMoney = sumMoney;
    }

    public String getCodeContract() {
        return codeContract;
    }

    public void setCodeContract(String codeContract) {
        this.codeContract = codeContract;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getFirstNumberMoney() {
        return firstNumberMoney;
    }

    public void setFirstNumberMoney(String firstNumberMoney) {
        this.firstNumberMoney = firstNumberMoney;
    }

    public String getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(String sumMoney) {
        this.sumMoney = sumMoney;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "codeContract='" + codeContract + '\'' +
                ", codeBooking='" + codeBooking + '\'' +
                ", firstNumberMoney='" + firstNumberMoney + '\'' +
                ", sumMoney='" + sumMoney + '\'' +
                '}';
    }
}
