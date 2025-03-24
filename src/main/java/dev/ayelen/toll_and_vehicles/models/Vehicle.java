package dev.ayelen.toll_and_vehicles.models;

import dev.ayelen.toll_and_vehicles.enums.VehicleKind;

public class Vehicle {
    protected String plate;
    protected VehicleKind type;

    public Vehicle(){}       
    

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public VehicleKind getType() {
        return type;
    }

    public void setType(VehicleKind type) { 
        this.type = type;  
    }
}
