import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation extends Thread {

    private final List<WeatherObserver> observers = new ArrayList<>();
    private final Random random = new Random();

    private double temperature;

    private static final double MIN_TEMP = -30;
    private static final double MAX_TEMP = 40;

    public WeatherStation() {
        temperature = MIN_TEMP + (MAX_TEMP - MIN_TEMP) * random.nextDouble();
    }

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public void run() {
        while (true) {

            double change = random.nextBoolean() ? 1.0 : -1.0;
            temperature += change;

            if (temperature > MAX_TEMP) {
                temperature = MAX_TEMP;
            }

            if (temperature < MIN_TEMP) {
                temperature = MIN_TEMP;
            }

            notifyObservers();

            try {
                int delay = 1000 + random.nextInt(4001);
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
