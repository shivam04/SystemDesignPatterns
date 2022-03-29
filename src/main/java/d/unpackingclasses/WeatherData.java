package d.unpackingclasses;

/**
 * Created by shivam.si on 29/03/22 9:27 am
 */

public class WeatherData {

    Display currentConditionsDisplay;
    Display statisticsDisplay;
    Display forecastDisplay;
    public float getTemperature() {
        return 0.0F;
    }
    public float getHumidity() {
        return 0.0F;
    }
    public float getPressure() {
        return 0.0F;
    }

    /*
     * This method get called
     * whenever the weather measurements
     * have been updated
     */
    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        /*
         * no way to add or delete display elements without changing whole code
         */
        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);

        //update(temp, humidity, pressure); we can encapsulate this
    }
}
