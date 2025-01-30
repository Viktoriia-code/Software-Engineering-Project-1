public class TemperatureConverter {
    // Constructor
    public TemperatureConverter() {
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static boolean isExtremeTemperature(double celsius) {
        if (celsius < -40 || celsius > 50) {
            return true;
        } else {
            return false;
        }
    }
}