package dev.ayelen.toll_and_vehicles.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    @DisplayName('Should create a vehicle with a plate and a type')
    void testVehicle() {
        Vehicle vehicleOne = new Vehicle();
        vehicleOne.setPlate("ABC123");
        vehicleOne.setType(VEHICLETYPE.CAR);
        assertThat(vehicleOne.getPlate()).isEqualTo("ABC123");
        assertThat(vehicleOne.getType()).isEqualTo(VEHICLETYPE.CAR);        
    }
}
