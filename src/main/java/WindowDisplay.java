public class WindowDisplay implements WeatherObserver {
    @Override
    public void update(double temperature) {
        System.out.printf("Window Display: Temperature is now %.1f C%n", temperature);
    }
}
