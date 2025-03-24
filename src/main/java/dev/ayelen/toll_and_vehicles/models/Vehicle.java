package dev.ayelen.toll_and_vehicles.models;

import dev.ayelen.toll_and_vehicles.enums.VehicleType;

public class Vehicle {
    protected String plate;
    protected VehicleType type;

    public Vehicle(){
        this.plate = plate;
        this.type = type;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) { 
        this.type = type;  
    }
}
