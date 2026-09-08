public class WeatherLogger implements WeatherObserver {
    @Override
    public void update(double temperature) {
        System.out.printf("Weather Logger: Recorded temperature %.1f C%n", temperature);
    }
}
