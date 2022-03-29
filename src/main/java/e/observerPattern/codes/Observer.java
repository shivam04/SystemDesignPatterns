package e.observerPattern.codes;

/**
 * Created by shivam.si on 29/03/22 11:44 am
 */

public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
