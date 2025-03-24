package dev.ayelen.toll_and_vehicles.models;

public class Tollbooth {
    protected String name;
    protected String city;
    protected float earnings;

    public Tollbooth() {
        this.name = name;       
        this.city = city;
        this.earnings = 0F;
    }

    public String getName() {
        return name;
    }   

    public void setName(String name) {
        this.name = name;
    }   

    public String getCity() {
        return city;
    }   

    public void setCity(String city) {
        this.city = city;
    }

    public float getEarnings() {
        return earnings;
    }

    public void updateEarnings(float newEarnings) {
        this.earnings += newEarnings;
    }

}
