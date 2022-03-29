package e.observerPattern.inbuiltObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by shivam.si on 29/03/22 10:43 am
 */

public class ForeCastDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;

    public ForeCastDisplay(Observable weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("ForeCast Conditions: " + temperature + " F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.display();
        }
    }
}
