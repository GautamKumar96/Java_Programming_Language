public class WeatherReport {

    public static void main(String[] args) {
        // Array to hold the days of the week
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Array to hold the weather conditions for each day
        String[] weatherConditions = {
            "Sunny", "Cloudy", "Rainy", "Sunny", "Windy", "Stormy", "Partly Cloudy"
        };

        // Array to hold the temperatures for each day
        int[] temperatures = {30, 28, 25, 32, 29, 22, 27}; // Temperatures in degrees Celsius

        // Printing the 1-week weather report
        System.out.println("1-Week Weather Report:");
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println(daysOfWeek[i] + ": " + weatherConditions[i] + ", Temperature: " + temperatures[i] + "°C");
        }
    }
}
