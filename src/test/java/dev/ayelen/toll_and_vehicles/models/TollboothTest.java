package dev.ayelen.toll_and_vehicles.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TollboothTest {

    @Test
    @DisplayName("Should create a tollbooth with a name, city and earnings")
    void testTollbooth() {
        Tollbooth tollboothOne = new Tollbooth();
        tollboothOne.setName("Tollbooth 1");
        tollboothOne.setCity("City 1");
        String name = tollboothOne.getName();
        String city = tollboothOne.getCity();
        float earnings = tollboothOne.getEarnings();
        assertThat(name, is("Tollbooth 1"));
        assertThat(city, is("City 1"));        
        assertThat(earnings, is(0));
    }
    

}
