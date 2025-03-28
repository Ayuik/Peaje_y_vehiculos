package dev.ayelen.toll_and_vehicles.controllers;

import dev.ayelen.toll_and_vehicles.enums.VehicleKind;
import dev.ayelen.toll_and_vehicles.models.Tollbooth;
import dev.ayelen.toll_and_vehicles.models.Vehicle;

public class TollboothController {

    Tollbooth tollbooth = new Tollbooth();
    VehicleKind kind;

    public TollboothController(Tollbooth tollbooth) {
        this.tollbooth = tollbooth;
    }

    public float saveVehicle(String plate, int type, int axles) {
        if (type == 1) {
            kind = VehicleKind.CAR;
        }
        if (type == 2) {
            kind = VehicleKind.MOTORCYCLE;
        }
        ;
        if (type == 3) {
            kind = VehicleKind.TRUCK;
        }

        Vehicle newVehicle = new Vehicle();
        newVehicle.setPlate(plate);
        newVehicle.setType(kind);

        tollbooth.addVehicle(newVehicle);

        float toll = tollbooth.chargeToll(newVehicle, axles);

        tollbooth.updateEarnings(toll);
        
        return toll;
    }

}
