public class PhoneDisplay implements WeatherObserver {
    @Override
    public void update(double temperature) {
        System.out.printf("Phone Display: Current temperature is %.1f C%n", temperature);
    }
}
