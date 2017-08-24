package model;

import java.util.Date;

public class Good {
    private int id;
    private String title;
    private Date expirationDate;
    private String vendor;
    private float weight;
    private float cost;

    public Good() {}

    public Good(int id, String title, Date expirationDate, String vendor, float weight, float cost) {
        super();
        this.id = id;
        this.title = title;
        this.expirationDate = expirationDate;
        this.vendor = vendor;
        this.weight = weight;
        this.cost = cost;
    }

    public String toString() {
        return "Goods: \n" +
                "-ID: " + getId() + "\n" +
                "-title: " + getTitle() + "\n" +
                "-expirationDate: " + getExpirationDate() + "\n" +
                "-vendor: " + getVendor() + "\n" +
                "-weight:" + getWeight() +"\n" +
                "-cost:" + getCost() +"\n;\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
