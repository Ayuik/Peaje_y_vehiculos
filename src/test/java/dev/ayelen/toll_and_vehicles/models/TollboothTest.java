package dev.ayelen.toll_and_vehicles.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.ayelen.toll_and_vehicles.enums.VehicleKind;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TollboothTest {
    Tollbooth tollboothOne; 

    @BeforeEach
    void setUp() {
        tollboothOne = new Tollbooth();
    }

    @Test
    @DisplayName("Should create a tollbooth with a name, city and earnings")
    void testTollbooth() {
        tollboothOne.setName("Tollbooth 1");
        tollboothOne.setCity("City 1");
        String name = tollboothOne.getName();
        String city = tollboothOne.getCity();
        float earnings = tollboothOne.getEarnings();
        assertThat(name, is("Tollbooth 1"));
        assertThat(city, is("City 1"));        
        assertThat(earnings, is(0F));
    }

    @Test
    @DisplayName("Should update de value of earnings")
    void testUpdateEarnings() {
        float newEarnings = 50F;
        tollboothOne.updateEarnings(newEarnings);
        float earnings = tollboothOne.getEarnings();
        assertThat(earnings, is(50F));
    }

    @Test
    @DisplayName("Should charge 100 a car")
    void testChargeToll_car() {
        Vehicle vehicleOne = new Vehicle();
        vehicleOne.setPlate("ABC123");
        vehicleOne.setType(VehicleKind.CAR);
        float newEarnings = tollboothOne.chargeToll(vehicleOne);
        assertThat(newEarnings, is(100F));
    }

    @Test
    @DisplayName("Should charge 50 a motorcycle")
    void testChargeToll_motorcycle() {
        Vehicle vehicleTwo = new Vehicle();
        vehicleTwo.setPlate("DEF123");
        vehicleTwo.setType(VehicleKind.MOTORCYCLE);
        float newEarnings = tollboothOne.chargeToll(vehicleTwo);
        assertThat(newEarnings, is(50F));
    }

    @Test
    @DisplayName("Should charge 50 per axle a truck")
    void testChargeToll_truck() {
        Vehicle vehicleThree = new Vehicle();
        vehicleThree.setPlate("DEF123");
        vehicleThree.setType(VehicleKind.TRUCK);
        int axles = 2;
        float newEarnings = tollboothOne.chargeToll(vehicleThree, axles);
        assertThat(newEarnings, is(50F));
    }
}


