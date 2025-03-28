package dev.ayelen.toll_and_vehicles.views;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TollboothViewsTest {
    @Test
    @DisplayName("Should print correct output")
    void testIndexPrintsOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        TollboothViews views = new TollboothViews();
        views.index();
        String expectedOutput = "=======================================";
        String expectedOutput2 = " Estación de Peaje: \"Peaje Central\"";
        String expectedOutput3 =" Ciudad: Llanera, Asturias";
        assertTrue(outContent.toString().contains(expectedOutput));
        assertTrue(outContent.toString().contains(expectedOutput2));
        assertTrue(outContent.toString().contains(expectedOutput3));
        System.setOut(System.out);
    }

}
