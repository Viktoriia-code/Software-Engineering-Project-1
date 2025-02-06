import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class TemperatureConverterTest {
    TemperatureConverter temperatureConverter = new TemperatureConverter();
    @Test
    void fahrenheitToCelsius() {
        // Arrange
        double fahrenheit = 32;
        double expected = 0;

        // Act
        double actual = temperatureConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void celsiusToFahrenheit() {
        // Arrange
        double celsius = 0;
        double expected = 32;

        // Act
        double actual = temperatureConverter.celsiusToFahrenheit(celsius);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void isExtremeTemperature() {
        // Arrange
        double celsius = -50;
        boolean expected = true;

        // Act
        boolean actual = temperatureConverter.isExtremeTemperature(celsius);

        // Assert
        assertEquals(actual, expected);


        assertFalse(temperatureConverter.isExtremeTemperature(-40));
        assertTrue(temperatureConverter.isExtremeTemperature(60));
    }
}