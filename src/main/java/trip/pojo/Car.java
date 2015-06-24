package trip.pojo;

import java.util.Date;

/**
 * Created by Ibram on 07/06/2015.
 */
public class Car {

    private Date StartDate;
    private Date endDate;
    private String rateCode;
    private String price;
    private int numDays;
    private String carCode;
    private String garanty;
    private String addionalDate;
    private String participationLevel;

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getNumDays() {
        return numDays;
    }

    public void setNumDays(int numDays) {
        this.numDays = numDays;
    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public String getGaranty() {
        return garanty;
    }

    public void setGaranty(String garanty) {
        this.garanty = garanty;
    }

    public String getAddionalDate() {
        return addionalDate;
    }

    public void setAddionalDate(String addionalDate) {
        this.addionalDate = addionalDate;
    }

    public String getParticipationLevel() {
        return participationLevel;
    }

    public void setParticipationLevel(String participationLevel) {
        this.participationLevel = participationLevel;
    }
}
