public class Main {
    public static void main(String[] args) throws InterruptedException {

        WeatherStation station = new WeatherStation();

        WeatherObserver phone = new PhoneDisplay();
        WeatherObserver window = new WindowDisplay();
        WeatherObserver logger = new WeatherLogger();

        station.registerObserver(phone);
        station.registerObserver(window);
        station.registerObserver(logger);

        System.out.println("Starting weather station...");
        station.start();

        // Let all observers receive updates for 15 seconds
        Thread.sleep(15000);

        System.out.println("\nRemoving Window Display...\n");
        station.removeObserver(window);

        // Continue simulation without Window Display
        Thread.sleep(15000);

        System.out.println("\nSimulation finished.");
        station.interrupt();
    }
}
